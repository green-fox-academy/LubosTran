package com.greenfoxacademy.basicwebshop.controllers;

import com.greenfoxacademy.basicwebshop.models.ShopItem;
import com.greenfoxacademy.basicwebshop.models.Store;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class WebController {
    Store store = new Store();
    @RequestMapping("/inventory")
    public String displayInventory(Model model){
        model.addAttribute("items", store.listAll());
        return "WebShop";
    }

    @RequestMapping("/available")
    public String displayAvailable(Model model){
        model.addAttribute("items", store.listAvailable());
        return "WebShop";
    }

    @RequestMapping("/cheapest")
    public String displayCheapestF(Model model){
        model.addAttribute("items", store.sortCheapest());
        return "WebShop";
    }

    @RequestMapping("/nike")
    public String displayNike(Model model){
        model.addAttribute("items", store.containNike());
        return "WebShop";
    }

    @RequestMapping("/avgStock")
    public String averageStock(Model model){
        model.addAttribute("text", "Average Stock: " + store.averageStock());
        return "stock";
    }

}
