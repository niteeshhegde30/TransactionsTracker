package org.transactionsTracker.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@EnableConfigurationProperties
public class DataSourceConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource() {
        // TODO: these configs should be read from applicaton.properites - make it work
        return DataSourceBuilder.create()
                .url("jdbc:mysql://localhost:3306/transactions_db")
                .username("root")
                .password("mysql")
                .driverClassName("com.mysql.cj.jdbc.Driver")
                .build();
    }

}
