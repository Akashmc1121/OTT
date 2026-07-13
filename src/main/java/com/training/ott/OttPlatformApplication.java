package com.training.ott;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OttPlatformApplication {
    public static void main(String[] args) {
        SpringApplication.run(OttPlatformApplication.class, args);
    }

    @GetMapping("/api/ping")
    public String ping() {
        return "{\"status\":\"UP\",\"message\":\"Mock OTT Backend Running\"}";
    }
}

