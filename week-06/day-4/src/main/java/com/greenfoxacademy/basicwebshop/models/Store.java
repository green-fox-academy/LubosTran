package com.greenfoxacademy.basicwebshop.models;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Store {

    private List<ShopItem> Inventory = new ArrayList<>();

    public Store() {
        ShopItem shoe = new ShopItem("Running shoes", "Nike running shoes for every day sport", 1000,5);
        ShopItem printer = new ShopItem("Printer", "Some HP printer that will print pages", 3000,2);
        ShopItem coke = new ShopItem("Coca cola", "0.5l standard coke", 25,0);
        ShopItem meal = new ShopItem("Wokin", "Chicken with fried rice and WOKIN sauce", 119,100);
        ShopItem shirt = new ShopItem("T-shirt", "Blue with a corgi on a bike", 300,1);

        this.Inventory = new ArrayList<>();
        Inventory.add(shoe);
        Inventory.add(printer);
        Inventory.add(coke);
        Inventory.add(meal);
        Inventory.add(shirt);
    }

    public List<ShopItem> listAll(){
        return Inventory;
    }

    public List<ShopItem> listAvailable(){
        List<ShopItem> available;
        available = Inventory.stream()
                .filter(item -> item.getQuantityOfStock()>0)
                .collect(Collectors.toList());
        return available;
    }

    public List<ShopItem> sortCheapest(){
        List<ShopItem> cheapestFirst;
        cheapestFirst = Inventory.stream()
                .sorted(Comparator.comparing(ShopItem::getPrice))
                .collect(Collectors.toList());

        return cheapestFirst;
    }

    public List<ShopItem> containNike(){
        List<ShopItem> nikes = new ArrayList<>();
        nikes = Inventory.stream()
                .filter(item -> item.getDescription().toLowerCase().contains("nike")|| item.getName().toLowerCase().contains("nike"))
                .collect(Collectors.toList());
        return nikes;
    }

    public double averageStock (){
        double avgStock;
        avgStock = Inventory.stream()
                .collect(Collectors.averagingDouble(ShopItem::getQuantityOfStock));
        return avgStock;
    }

    public String getMostExpensive(){
        Optional<ShopItem> theMostExpensive = Inventory.stream()
                .max(Comparator.comparing(ShopItem::getPrice));
        return theMostExpensive.get().getName();
    }
}
