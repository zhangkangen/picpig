package com.zhang.picpig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * swagger2 配置
 * @author zxk
 * @date 2018-1-1 22:18:21
 */
@Configuration
public class Swagger2 {

    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage(""))
                .paths(PathSelectors.any())
                .build();
    }

    public ApiInfo apiInfo(){
        return  new ApiInfoBuilder()
                .title("springboot使用swagger构建api文档")
                .description("springboot使用swagger构建api文档")
                .termsOfServiceUrl("")
                .version("1.0")
                .build();
    }
}
