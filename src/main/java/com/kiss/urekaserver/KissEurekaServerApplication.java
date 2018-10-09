package com.kiss.urekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class KissEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(KissEurekaServerApplication.class, args);
    }
}
