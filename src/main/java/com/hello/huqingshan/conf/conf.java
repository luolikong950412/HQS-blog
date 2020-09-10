package com.hello.huqingshan.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class conf {

    @Bean
    public void test(){
        System.out.println("this is bean");
    }
}
