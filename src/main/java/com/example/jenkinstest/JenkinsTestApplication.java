package com.example.jenkinstest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsTestApplication {

    public static void main(String[] args) {
        Test test = new Test();
        test.test();
        SpringApplication.run(JenkinsTestApplication.class, args);
    }

}
