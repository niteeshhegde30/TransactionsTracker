package org.transactionsTracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.sql.*;

@SpringBootApplication
@ComponentScan
public class MyApplication {

    // TODO : my-batis-config.xml is not being used as of now - decide whether to keep it
    public static void main(String[] args) {
        // TODO : replace print with log statements
        System.out.println("Started the application");
        SpringApplication.run(MyApplication.class, args);
    }

}