package com.zwm.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*指定当前启动类扫描的包*/
@SpringBootApplication(scanBasePackages = {"com.zwm.demo"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
