package com.company.dice;

import com.company.field.Field;
import sample.Player;

import java.util.ArrayList;

public class Dice {
    private int firstDice;
    private int secondDice;
    private int result;

    public Dice(int firstDice, int secondDice, int result) {
        this.firstDice = firstDice;
        this.secondDice = secondDice;
        this.result = result;
    }

    public Dice getThrowDice() {
        this.firstDice = (int) (Math.random() * 6 + 1);
        this.secondDice = (int) (Math.random() * 6 + 1);
        this.result = this.firstDice + this.secondDice;
        return new Dice(this.firstDice, this.secondDice, this.result);
    }

    public int getFirstDice() {
        return this.firstDice;
    }

    public int getSecondDice() {
        return this.secondDice;
    }

    public int getResult() {
        return this.result;
    }

    public Player throwDice(Player player, ArrayList<Field> field) {

        Dice dice = getThrowDice();

        if (dice.getFirstDice() != dice.getSecondDice()) {
            System.out.println("Бросаете кость. Выпало всего: " + getResult());
            player.getLocation().setNumberOfField(player.getLocation().getNumberOfField() + getResult());
            player.getLocation().setName(Field.searchFieldByNumber(player.getLocation().getNumberOfField(), field).getName());
        } else {
            System.out.println("У ваших игральных кубиков выпало одиноковое значение! Пожалуйста, бросьте еще раз.");

            dice = getThrowDice();

            if (dice.getFirstDice() != dice.getSecondDice()) {
                System.out.println("Вам повезло. Продвиньтесь на такое количество полей вперед: " + getResult());
                player.getLocation().setNumberOfField(player.getLocation().getNumberOfField() + getResult());
                player.getLocation().setName(Field.searchFieldByNumber(player.getLocation().getNumberOfField(), field).getName());
            } else {
                System.out.println("У ваших игральных кубиков выпало одиноковое значение! Пожалуйста, бросьте еще раз.");

                dice = getThrowDice();

                if (dice.getFirstDice() != dice.getSecondDice()) {
                    System.out.println("Вам повезло. Продвиньтесь на такое количество полей вперед: " + getResult());
                    player.getLocation().setNumberOfField(player.getLocation().getNumberOfField() + getResult());
                    player.getLocation().setName(Field.searchFieldByNumber(player.getLocation().getNumberOfField(), field).getName());
                } else {
                    System.out.println("Вы должны отправиться в тюрьму ");
                    player.getLocation().setNumberOfField(11);
                    player.getLocation().setName(Field.searchFieldByNumber(player.getLocation().getNumberOfField(), field).getName());
                    player.setConclusion(true);
                }
            }
        }
    return player;
    }
}