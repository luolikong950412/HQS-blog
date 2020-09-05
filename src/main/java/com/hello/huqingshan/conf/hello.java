package com.hello.huqingshan.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class hello {

    @Bean(name = "hello-test")  //不能和已有的benan重名
    public void test(){
        System.out.println("hello");
    }
}
