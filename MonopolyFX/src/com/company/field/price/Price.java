package com.company.field.price;

public class Price {

    private int buyLand, buyBuilding;
    private RentPrice rentPrice;

    public Price (int bueLand,int buyBuilding,RentPrice rentPrice){
        this.buyLand=bueLand;
        this.buyBuilding=buyBuilding;
        this.rentPrice=rentPrice;

    }
    public int getBuyLand() {
        return buyLand;
    }
    public int getBuyBuilding() {
        return buyBuilding;
    }
    public RentPrice getRentPrice() {
        return rentPrice;
    }


}
