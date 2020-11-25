package com.company.cards;
/*Шанс*/
import com.company.field.Field;
import sample.Player;

public class Chance extends Cards{
    private Field numberFieldForTransition;
    private int moneyPlusOrMinus;

    public Chance(String text, Field numberFieldForTransition,int moneyPlusOrMinus) {
        super(text);
        this.numberFieldForTransition = numberFieldForTransition;
        this.moneyPlusOrMinus=moneyPlusOrMinus;
    }

    public Field getNumberFieldForTransition() {
        return numberFieldForTransition;
    }
    public int getMoneyPlusOrMinus (){
        return moneyPlusOrMinus;
    }
    /*изменение позиции игрока по карточке Шанс*/
    public static void movementByChance(Chance chance, Player player) {
        if (chance.getNumberFieldForTransition() != null) {
            player.setLocation(chance.getNumberFieldForTransition());
        }
    }
}

