package com.greenfox.pet.pet.models;


import java.util.ArrayList;
import java.util.List;

public class Fox {
    private String name;
    private List<String> tricks = new ArrayList<>();
    private String food = "pizza";
    private String drink;

    public Fox(String name) {
        this.name = name;
    }

    public Fox(String name, String food, String drink) {
        this.name = name;
        this.food = food;
        this.drink = drink;
    }

    public void addTrick(String name){
        this.tricks.add(name);
    }

    public List<String> getTricks() {
        return tricks;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getName() {
        return name;
    }
}
