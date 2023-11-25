package org.example.asvs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestAsvsTestingApplication {

    public static void main(String[] args) {
        SpringApplication.from(AsvsTestingApplication::main).with(TestAsvsTestingApplication.class).run(args);
    }

}
