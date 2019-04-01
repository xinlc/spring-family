package com.example.session;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@SpringBootApplication
@RestController
@EnableRedisHttpSession
@Slf4j
public class SessionDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SessionDemoApplication.class, args);
    }

    @RequestMapping("/hello")
    public String printSession(HttpSession session, String name) {
        String storedName = (String) session.getAttribute("name");
        log.info("storedName: {}", storedName);
        if (storedName == null) {
            session.setAttribute("name", name);
            storedName = name;
        }
        return "hello " + storedName;
    }

}
