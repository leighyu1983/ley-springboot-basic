package com.ley.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
// 加载application.property文件中的绝对路径 config.path
@PropertySource(value = {"file:${config.path}"}, encoding="utf-8")
public class TestConfig {

    @Value("${ley}")
    private String ley;

    @PostConstruct
    public void postConstruct() {
        System.out.println("config property ley:" + this.ley);
    }
}
