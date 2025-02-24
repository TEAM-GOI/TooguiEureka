package com.ssafy.tooguieureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TooguiEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(TooguiEurekaApplication.class, args);
    }

}
