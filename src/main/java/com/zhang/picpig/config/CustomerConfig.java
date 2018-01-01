package com.zhang.picpig.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * 数据库配置
 *
 * @author zxk
 */
@Configuration
@MapperScan(basePackages = "com.zhang.picpig.dao.customer", sqlSessionTemplateRef = "customerSqlSessionTemplate")
public class CustomerConfig {

    private Logger logger = LoggerFactory.getLogger(CustomerConfig.class);

    @Autowired
    private CustomerDataSourceConfig customerDataSourceConfig;

    @Autowired
    private CommonDataSourceConfig commonDataSourceConfig;

    @Bean(name = "customerDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.customer")
    public DataSource dataSourceCustomer() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(customerDataSourceConfig.getUrl());
        dataSource.setUsername(customerDataSourceConfig.getUsername());
        dataSource.setPassword(customerDataSourceConfig.getPassword());
        dataSource.setDriverClassName(customerDataSourceConfig.getDriverClassName());

        //configuration
        dataSource.setInitialSize(commonDataSourceConfig.getInitialSize());
        dataSource.setMinIdle(commonDataSourceConfig.getMinIdle());
        dataSource.setMaxActive(commonDataSourceConfig.getMaxActive());
        dataSource.setMaxWait(commonDataSourceConfig.getMaxWait());
        dataSource.setTimeBetweenEvictionRunsMillis(commonDataSourceConfig.getTimeBetweenEvictionRunsMillis());
        dataSource.setMinEvictableIdleTimeMillis(commonDataSourceConfig.getMinEvictableIdleTimeMillis());
        dataSource.setValidationQuery(commonDataSourceConfig.getValidationQuery());
        dataSource.setTestWhileIdle(commonDataSourceConfig.isTestWhileIdle());
        dataSource.setTestOnBorrow(commonDataSourceConfig.isTestOnBorrow());
        dataSource.setTestOnReturn(commonDataSourceConfig.isTestOnReturn());
        dataSource.setPoolPreparedStatements(commonDataSourceConfig.isPoolPreparedStatements());
        dataSource.setMaxPoolPreparedStatementPerConnectionSize(commonDataSourceConfig.getMaxPoolPreparedStatementPerConnectionSize());
        try {
            dataSource.setFilters(commonDataSourceConfig.getFilters());
        } catch (SQLException e) {
            e.printStackTrace();
            logger.error("ruid configuration initialization filter", e);
        }
        dataSource.setConnectionProperties(commonDataSourceConfig.getConnectionProperties());
        return dataSource;
    }

    @Bean(name = "customerSqlSessionFactory")
    public SqlSessionFactory customerSqlSessionFactory(@Qualifier("customerDataSource") DataSource dataSource) throws Exception {

        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mybatis/mapper/customer/*.xml"));
        bean.setConfigLocation(new PathMatchingResourcePatternResolver().getResource("classpath:mybatis/mybatis-config.xml"));
        return bean.getObject();
    }

    @Bean(name = "customerTransactionManager")
    @Primary
    public DataSourceTransactionManager customerTransactionManager(@Qualifier("customerDataSource")DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }

    public SqlSessionTemplate customerSqlSessionTemplate(@Qualifier("customerSqlSessionFactory")SqlSessionFactory sqlSessionFactory)throws Exception{
        return  new SqlSessionTemplate(sqlSessionFactory);
    }

}
