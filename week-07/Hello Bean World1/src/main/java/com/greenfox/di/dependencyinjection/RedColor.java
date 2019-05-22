package com.greenfox.di.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedColor implements MyColor{
    private Printer printer;

    @Autowired
    RedColor (Printer printer){
        this.printer = printer;
    }

    @Override
    public void printColor() {
        printer.log("Red is the blood that run through our veins");
    }
}
