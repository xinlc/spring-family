package com.example.autoconfigure;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

@Slf4j
public class DemoApplicationRunner implements ApplicationRunner {
    public DemoApplicationRunner() {
        log.info("Initializing DemoApplicationRunner.");
    }
    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("Hello everyone! we all like Spring!");
    }
}
