package com.example.SpringProject.service;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class printerService {

    private houseBuildService houseBuildService= new houseBuildService();

    @PostConstruct
    public void printSomething(){

        System.out.println("i am printer service");
    }


}
