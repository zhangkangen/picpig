package com.zhang.picpig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author zxk
 */
@SpringBootApplication
@EnableSwagger2
public class PigpicApplication {

    public static void main(String[] args) {
        SpringApplication.run(PigpicApplication.class, args);
    }
}
