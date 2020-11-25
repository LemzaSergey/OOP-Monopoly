package com.company.field;

public class UtilityCompanyField extends Field {

    private int price;

    public UtilityCompanyField(String name, int numberOfField, int price) {
        super(name, numberOfField);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
