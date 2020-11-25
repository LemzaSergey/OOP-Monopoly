package sample;

import com.company.field.Field;

import java.util.Map;

public class Player {
    private int playerNumber;//номер игрока
    private String playerName;//имя игрока
    private int money;//баланс
    private Field location;//позиция
    private boolean conclusion;//заключение
    private int cardFreedom;//карта освобождения


    public Player(int playerNumber, String playerName, int money, Field location, boolean conclusion, int cardFreedom) {
        this.playerNumber = playerNumber;
        this.playerName = playerName;
        this.money = money;
        this.location = location;
        this.conclusion = conclusion;
        this.cardFreedom = cardFreedom;
    }

    public Player() {
        this(0, null, 0, null, false, 0);
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Field getLocation() {
        return location;

    }

    public void setLocation(Field location) {
        this.location = location;
    }


    public Boolean getConclusion() {
        return conclusion;
    }

    public void setConclusion(Boolean conclusion) {
        this.conclusion = conclusion;
    }

    public int getCardFreedom() {
        return cardFreedom;
    }

    public void setCardFreedom(int cardFreedom) {
        this.cardFreedom = cardFreedom;
    }

    /*добавление/убавление монет у участника*/
    public static void addMoney(Player player, int money) {
        int playersMoney = player.getMoney() + money;
        player.setMoney(playersMoney);
    }
    /*изменение пары игрок-место нахождения*/
    public void setLocationPlayer(Map<Player, Field> ownProperty, Player player, Field field) {
        ownProperty.put(player, field);
    }
}
