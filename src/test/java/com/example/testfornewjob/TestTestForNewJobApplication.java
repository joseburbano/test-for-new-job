package com.example.testfornewjob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestTestForNewJobApplication {

    public static void main(String[] args) {
        SpringApplication.from(TestForNewJobApplication::main).with(TestTestForNewJobApplication.class).run(args);
    }

}
