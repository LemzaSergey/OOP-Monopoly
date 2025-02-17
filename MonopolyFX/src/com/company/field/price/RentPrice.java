package com.company.field.price;

public class RentPrice {
    private int rentPriceWithoutBuildings, rentPriceWithHotel;
    private int [] rentPriceWithHouse;

    public RentPrice(int rentPriceWithoutBuildings, int[] rentPriceWithHouse, int rentPriceWithHotel) {
        this.rentPriceWithoutBuildings = rentPriceWithoutBuildings;
        this.rentPriceWithHouse = rentPriceWithHouse;
        this.rentPriceWithHotel = rentPriceWithHotel;
    }

    public int getRentPriceWithoutBuildings() {
        return rentPriceWithoutBuildings;
    }

    public int[] getRentPriceWithHouse() {
        return rentPriceWithHouse;
    }

    public int getRentPriceWithHotel() {
        return rentPriceWithHotel;
    }

}