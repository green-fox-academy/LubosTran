package com.greenfox.lubos.bankofsimba.controllers;

import com.greenfox.lubos.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class BankController {
    BankAccount simba = new BankAccount("Simba", 2000,"lion");



    @RequestMapping("/show")
    public String show (Model model){
        model.addAttribute("acc", simba);
        model.addAttribute("currency", "Zebra");
        return "Bank";
    }

    @RequestMapping("/wut")
    public String displayEndpoint (Model model){
        model.addAttribute("wut","\"This is an <em>HTML</em> text. <b>Enjoy yourself!</b>\"");
        return "HTMLception";
    }

    @RequestMapping("/list")
    public String listAcc (Model model){
        BankAccount idontcare = new BankAccount("idc",3000,"dog");
        BankAccount idontcare1 = new BankAccount("idc1",1000,"cat");
        BankAccount idontcare2 = new BankAccount("idc2",9000,"chicken");
        BankAccount idontcare3 = new BankAccount("idc3",309.02,"worm");
        simba.setKing(true);
        List<BankAccount> bankAccounts = new ArrayList<>();
        bankAccounts.add(idontcare);
        bankAccounts.add(idontcare1);
        bankAccounts.add(idontcare2);
        bankAccounts.add(idontcare3);
        bankAccounts.add(simba);
        idontcare.setGoodOrBad("good");
        idontcare1.setGoodOrBad("bad");
        idontcare2.setGoodOrBad("bad");
        idontcare3.setGoodOrBad("bad");
        simba.setGoodOrBad("good");

        model.addAttribute("currency", "Zebra");
        model.addAttribute("list",bankAccounts);
        model.addAttribute("shiny", "Background-color: gold");
        return "Bank";
    }
}
