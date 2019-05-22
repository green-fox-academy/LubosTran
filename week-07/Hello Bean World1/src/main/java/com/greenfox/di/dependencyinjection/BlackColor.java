package com.greenfox.di.dependencyinjection;

import org.springframework.stereotype.Service;


public class BlackColor implements MyColor{
    @Override
    public void printColor() {
        System.out.println("Black is the color of my lover's hair");
    }
}
