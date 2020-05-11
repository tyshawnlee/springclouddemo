package com.tyshawn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class BookConsumeDashboard_App {

    public static void main(String[] args) {
        SpringApplication.run(BookConsumeDashboard_App.class, args);
    }
}
