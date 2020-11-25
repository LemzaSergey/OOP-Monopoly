package sample;

import com.company.cards.Chance;
import com.company.cards.Treasury;
import com.company.field.*;
import com.company.field.price.Price;
import com.company.field.price.RentPrice;

import javafx.scene.paint.Color;

import java.util.*;

public class MonopolyProcess {

    public void addFields(ArrayList<Field> field) {
        field.add(new Field("Старт", 1));
        field.add(new StreetField("Старая дорога", 2, Color.web("#803900"), new Price(60, 50, new RentPrice(2, new int[]{10, 30, 90, 160}, 250))));
        field.add(new ActionField("Казна", 3));
        field.add(new StreetField("Главное шоссе", 4, Color.web("#803900"), new Price(60, 50, new RentPrice(4, new int[]{20, 60, 180, 320}, 450))));
        field.add(new ActionField("Налог с дохода", 5));
        field.add(new RailwayField("Западная железная дорога", 6, 200));
        field.add(new StreetField("Аквапарк", 7, Color.web("#d1e9ff"), new Price(100, 50, new RentPrice(6, new int[]{30, 90, 270, 400}, 550))));
        field.add(new ActionField("Шанс", 8));
        field.add(new StreetField("Городской парк", 9, Color.web("#d1e9ff"), new Price(100, 50, new RentPrice(6, new int[]{30, 90, 270, 400}, 550))));
        field.add(new StreetField("Горнолыжный курорт", 10, Color.web("#d1e9ff"), new Price(120, 50, new RentPrice(8, new int[]{40, 100, 300, 450}, 600))));
        field.add(new ActionField("Тюрьма", 11));
        field.add(new StreetField("Спальный район", 12, Color.GREEN, new Price(140, 100, new RentPrice(10, new int[]{50, 150, 450, 625}, 750))));
        field.add(new UtilityCompanyField("Электростанция", 13, 200));
        field.add(new StreetField("Деловой квартал ", 14, Color.GREEN, new Price(140, 100, new RentPrice(10, new int[]{50, 150, 450, 625}, 750))));
        field.add(new StreetField("Торговая площадь", 15, Color.GREEN, new Price(160, 100, new RentPrice(12, new int[]{60, 180, 500, 700}, 900))));
        field.add(new RailwayField("Северная железная дорога", 16, 200));
        field.add(new StreetField("Компьютеры", 17, Color.PINK, new Price(260, 150, new RentPrice(22, new int[]{110, 330, 800, 975}, 1150))));
        field.add(new ActionField("Казна", 18));
        field.add(new StreetField("Интернет", 19, Color.PINK, new Price(260, 150, new RentPrice(22, new int[]{110, 330, 800, 975}, 1150))));
        field.add(new StreetField("Сотовая связь", 20, Color.PINK, new Price(280, 150, new RentPrice(24, new int[]{120, 360, 850, 1025}, 1200))));
        field.add(new ActionField("Бесплатная парковка", 21));
        field.add(new StreetField("Морские перевозки", 22, Color.BLUE, new Price(300, 200, new RentPrice(26, new int[]{130, 390, 900, 1100}, 1275))));
        field.add(new ActionField("Шанс", 23));
        field.add(new StreetField("Железная дорога", 24, Color.BLUE, new Price(300, 200, new RentPrice(26, new int[]{130, 390, 900, 1100}, 1275))));
        field.add(new StreetField("Авиакомпания", 25, Color.BLUE, new Price(320, 200, new RentPrice(28, new int[]{150, 450, 1000, 1200}, 1400))));
        field.add(new RailwayField("Восточная железная дорога", 26, 200));
        field.add(new StreetField("Улица Пушкина", 27, Color.CYAN, new Price(180, 100, new RentPrice(14, new int[]{70, 200, 550, 750}, 950))));
        field.add(new StreetField("Проспект мира", 28, Color.CYAN, new Price(180, 100, new RentPrice(14, new int[]{70, 200, 550, 750}, 950))));
        field.add(new UtilityCompanyField("Водопровод", 29, 200));
        field.add(new StreetField("Проспект победы", 30, Color.CYAN, new Price(200, 100, new RentPrice(16, new int[]{80, 220, 600, 800}, 1000))));
        field.add(new ActionField("Отправляйтесь в тюрьму", 31));
        field.add(new StreetField("Бар", 32, Color.RED, new Price(220, 150, new RentPrice(18, new int[]{90, 250, 700, 875}, 1050))));
        field.add(new StreetField("Ночной клуб", 33, Color.RED, new Price(220, 150, new RentPrice(18, new int[]{90, 250, 700, 875}, 1050))));
        field.add(new ActionField("Казна", 34));
        field.add(new StreetField("Ресторан", 35, Color.RED, new Price(240, 150, new RentPrice(22, new int[]{100, 300, 750, 925}, 1100))));
        field.add(new RailwayField("Южная железная дорога", 36, 200));
        field.add(new ActionField("Шанс", 37));
        field.add(new StreetField("Курортная зона", 38, Color.web("#0077ff"), new Price(350, 200, new RentPrice(35, new int[]{175, 500, 1100, 1300}, 1500))));
        field.add(new ActionField("Дорогая покупка", 39));
        field.add(new StreetField("Гостиничный комплекс", 40, Color.web("#0077ff"), new Price(400, 200, new RentPrice(50, new int[]{200, 600, 1400, 1700}, 2000))));


    }

    public void addTreasury(Queue<Treasury> treasury) {
        treasury.add(new Treasury("Банковская ошибка в вашу пользу", 200));
        treasury.add(new Treasury("Выгодная продажа акций", 25));
        treasury.add(new Treasury("Освобождение из тюрьмы", 0));
        treasury.add(new Treasury("Вы получили наследство", 100));
        treasury.add(new Treasury("Возмещение налога", 25));
        treasury.add(new Treasury("Вас арестовали", 0));
        treasury.add(new Treasury("Оплата страховки", -50));
        treasury.add(new Treasury("Вы заняли второе место на конкурсе красоты", 10));
        treasury.add(new Treasury("Выгодня продажа облигаций", 50));
        treasury.add(new Treasury("Оплата лечения", -100));
        treasury.add(new Treasury("Сбор ренты", 100));
        treasury.add(new Treasury("С днем рождения!", 30));
        treasury.add(new Treasury("Заплатите штраф", -10));
        treasury.add(new Treasury("Оплата услуг доктора", -50));
    }

    public void addChance(ArrayDeque<Chance> chance, ArrayList<Field> field) {
        chance.add(new Chance("Отправляйтесь в гостиничный комплекс", Field.searchFieldByName("Гостиничный комплекс", field), 0));
        chance.add(new Chance("Пройдите на старт", Field.searchFieldByName("Старт", field), 0));
        chance.add(new Chance("Освобождение из тюрьмы", null, 0));
        chance.add(new Chance("Сбор на ремонт улицы", null, -100));
        chance.add(new Chance("Отправляйтесь в ресторан", Field.searchFieldByName("Ресторан", field), 0));
        chance.add(new Chance("Штраф за превышение скорости", null, -15));
        chance.add(new Chance("Возврат займа", null, 150));
        chance.add(new Chance("Отправляйтесь в бар", Field.searchFieldByName("Бар", field), 0));
        chance.add(new Chance("Освобождение из тюрьмы", null, 0));
        chance.add(new Chance("Отправляйтесь в аквапарк", Field.searchFieldByName("Аквапарк", field), 0));
        chance.add(new Chance("Отправляйтесь в тюрьму", Field.searchFieldByName("Тюрьма", field), 0));
        chance.add(new Chance("Банковские дивидеды", null, 50));
        chance.add(new Chance("Капитальный ремонт", null, -50));
    }


    public void addPlayers(ArrayList<Player> players) {
        int numberOfPlayers = 4;
        ArrayList<String> names = new ArrayList<>();
        names.add("Сергей");
        names.add("Ваня");
        names.add("Максим");
        names.add("Екатерина");
        for (int i = 0; i < numberOfPlayers; i++) {
            for (String name : names) {
                Player player = new Player();
                player.setPlayerNumber(i + 1);
                player.setPlayerName(name);
                player.setMoney(1500);
                player.setLocation(new Field(null, 1));
                player.setConclusion(false);
                player.setCardFreedom(0);
                Player.addMoney(player, 5);
                players.add(player);


            }
        }
    }

    /*добавление пары игрок-место нахождения*/
    public void addLocationPlayer(Map<Player, Field> ownProperty, ArrayList<Player> player) {
        for (Player players : player) {
            ownProperty.put(players, new Field("Старт", 1));
        }
    }

    public boolean isGameOver(Queue<Player> players) {
        int countOfBankrupt = 0;
        Player winner = null;
        for (Player player : players) {
            if (player.getMoney() == 0) {
                countOfBankrupt++;
            } else {
                winner = player;
            }
        }
        if (countOfBankrupt >= (players.size() - 1)) {
            endGame(players);
            System.out.println("Победитель:" + winner.getPlayerNumber());
            return true;
        }
        return false;
    }

    public void endGame(Queue<Player> players) {
        int highAmountOfMoney = 0;
        int count = 0;
        Map<Integer, Player> rating = new HashMap<>();
        for (Player player : players) {

            if (highAmountOfMoney == player.getMoney()) {
                count++;
                rating.put(count, player);
            } else if (highAmountOfMoney < player.getMoney()) {
                count = 1;
                rating.put(count, player);
                highAmountOfMoney = player.getMoney();
            } else {
                rating.put(rating.size(), player);
            }
        }

        System.out.println("Рейтинг игроков: ");
        for (int i = 0; i < count; i++) {
            System.out.println(rating.get(i - 1).getPlayerNumber());
        }
        System.exit(0);
    }


}
