package com.lty.fsb.common.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * create by  lty
 * on  2019-04-28  16:14
 */
@Configuration
public class DataSoucesConfig {
    @Bean
    @ConfigurationProperties("spring.datasource.db1")
    DataSource dsOne(){
        return DataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties("spring.datasource.db2")
    DataSource dsTwo(){
        return DataSourceBuilder.create().build();
    }
}
