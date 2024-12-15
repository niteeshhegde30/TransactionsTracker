package org.transactionsTracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;

@SpringBootApplication
@ComponentScan
public class MyApplication {

    private static final String JDBC_CONNECTION_URL = "jdbc:mysql://localhost:3306/transactions_db";
    private static final String MYSQL_USER_NAME = "root";
    private static final String MYSQL_PASSWORD = "mysql";

    public static void main(String[] args) {
        System.out.println("Started the application");

        try{
            Connection connection = DriverManager.getConnection(JDBC_CONNECTION_URL,MYSQL_USER_NAME, MYSQL_PASSWORD);
            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(
                    "select * from transaction");
            double amount;
            Date date;
            while (resultSet.next()) {
                amount = resultSet.getDouble("amount");
                date = resultSet.getDate("date");
                System.out.println("Amount : " + amount
                        + " Date : " + date);
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e){
            System.out.println(e);
        }
        SpringApplication.run(MyApplication.class, args);
    }

}