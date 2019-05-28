package com.greenfoxacademy.basicwebshop.models;

public class SomeWebsite {
    private String name;
    private String url;

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public SomeWebsite(String name, String url){
        this.name = name;
        this.url = url;
    }
}
