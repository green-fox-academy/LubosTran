package com.greenfox.di.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloBeanWorldApplication implements CommandLineRunner {

    private Printer printer;
    private MyColor color;

    @Autowired
    HelloBeanWorldApplication(MyColor color){
        this.color = color;
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloBeanWorldApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception{
        color.printColor();
    }
}
