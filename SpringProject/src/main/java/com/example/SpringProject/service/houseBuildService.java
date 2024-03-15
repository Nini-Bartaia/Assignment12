package com.example.SpringProject.service;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class houseBuildService {


    @PostConstruct
    public void buildHouse(){

        System.out.println("i am building house");
    }



}
