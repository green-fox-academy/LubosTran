package com.greenfox.di.dependencyinjection;

public class GreenColor implements MyColor{
    @Override
    public void printColor() {
        System.out.println("Green as the poison you put in my drink");
    }
}
