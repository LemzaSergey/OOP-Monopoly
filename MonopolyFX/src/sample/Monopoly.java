package sample;

import com.company.cards.Chance;
import com.company.cards.Treasury;
import com.company.field.Field;


import java.util.*;

public class Monopoly {
    private MonopolyProcess monopolyProcess;
    private ArrayList<Field> field;
    private ArrayDeque<Treasury> treasury;
    private ArrayDeque<Chance> chance;
    private ArrayList<Player> players;
    private Map<Field,Player> ownProperty;//собственность игороков
    private Map<Player,Field> locationPlayer;//место нахождения игроков


    public Monopoly() {
        monopolyProcess = new MonopolyProcess();
        field = new ArrayList<>();
        treasury = new ArrayDeque<>();
        chance = new ArrayDeque<>();
        players = new ArrayList<>();
        ownProperty = new HashMap<>();
        locationPlayer= new HashMap<>();


    }


    public void setUpMonopoly() {
        monopolyProcess.addFields(field);
        monopolyProcess.addTreasury(treasury);
        monopolyProcess.addChance(chance, field);
        monopolyProcess.addPlayers(players);
        monopolyProcess.addLocationPlayer(locationPlayer,players);

    }

    /*public void playMonopoly() throws InterruptedException {
        while (!monopolyProcess.isGameOver(players)) {
            for (Player player : players) {
                System.out.println("Ход игрока номер: " + player.getPlayerNumber());
                monopolyProcess.dice();

                Thread.sleep(1000);

            }
        }
    }*/

}
