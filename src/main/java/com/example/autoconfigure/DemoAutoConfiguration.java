package com.example.autoconfigure;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

@Configurable
@ConditionalOnClass(DemoApplicationRunner.class)
public class DemoAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(DemoApplicationRunner.class)
    @ConditionalOnProperty(name = "demo.enabled", havingValue = "true", matchIfMissing = true)
    public DemoApplicationRunner demoApplicationRunner(){
        return new DemoApplicationRunner();
    }
}
