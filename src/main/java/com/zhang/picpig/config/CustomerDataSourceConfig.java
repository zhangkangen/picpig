package com.zhang.picpig.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "spring.datasource.customer")
@PropertySource("classpath:config/jdbc-customer-dev.properties")
public class CustomerDataSourceConfig extends DataSourceConfig {
}
