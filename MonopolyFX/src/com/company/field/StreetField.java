package com.company.field;

import com.company.field.price.Price;

import javafx.scene.paint.Color;

public class StreetField extends Field {
    private Color color;
    private Price price;

    public StreetField(String name, int numberOfField, Color color, Price price) {
        super(name, numberOfField);
        this.color = color;
        this.price = price;
    }

    public Price getPrice() {
        return price;
    }

    public Color getColor() {
        return color;
    }
}
