package com.company.cards;
/*Казначейство*/
public class Treasury extends Cards{
    private int moneyPlusOrMinus;

    public Treasury(String text, int moneyPlusOrMinus) {
        super(text);
        this.moneyPlusOrMinus = moneyPlusOrMinus;
    }
}
