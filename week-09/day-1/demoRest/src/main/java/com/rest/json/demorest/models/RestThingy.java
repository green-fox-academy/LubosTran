package com.rest.json.demorest.models;

public class RestThingy {
    private Integer result;
    private Integer received;

    public RestThingy(){

    }

    public RestThingy(Integer received) {
        this.received = received;
        this.result = doubling(received);
    }

    public Integer doubling(Integer aNumber){
        return aNumber * 2;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public Integer getReceived() {
        return received;
    }

    public void setReceived(Integer received) {
        this.received = received;
    }

    @Override
    public String toString() {
        return  "not correct param in url";
    }
}
