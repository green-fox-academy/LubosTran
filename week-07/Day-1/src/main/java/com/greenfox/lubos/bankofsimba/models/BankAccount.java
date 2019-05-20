package com.greenfox.lubos.bankofsimba.models;

public class BankAccount {
    private String name;
    private double balance;
    private String animalType;
    private boolean King;
    private String goodOrBad;

    public String getGoodOrBad() {
        return goodOrBad;
    }

    public void setGoodOrBad(String alliance) {
        if(alliance.toLowerCase().equals("good")){
            this.goodOrBad = "Good Guy";
        }else if(alliance.toLowerCase().equals("bad")){
            this.goodOrBad = "Bad Guy";
        }
    }

    public boolean isKing() {
        return King ;
    }

    public void setKing(boolean king) {
        King = king;
    }

    public BankAccount(String name, double balance, String animalType) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }


}
