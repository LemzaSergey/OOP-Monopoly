package com.company.field;

public class RailwayField extends Field {
    private int price;

    public RailwayField(String name, int numberOfField, int price) {
        super(name, numberOfField);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
