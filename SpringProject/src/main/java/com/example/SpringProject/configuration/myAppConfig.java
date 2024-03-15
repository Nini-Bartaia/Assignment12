package com.example.SpringProject.configuration;
import com.example.SpringProject.service.houseBuildService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class myAppConfig {


    @Bean
    public houseBuildService houseBuildService(){

        houseBuildService houseBuildService= new houseBuildService();
        return houseBuildService;


    }



}
