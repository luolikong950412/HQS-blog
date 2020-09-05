package com.hello.huqingshan.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class conf {

    @Bean //默认情况下方法名为bean的名字
    public void test(){
        System.out.println("this is bean");
    }
}
