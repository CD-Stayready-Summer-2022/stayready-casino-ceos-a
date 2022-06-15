package com.stayready.stayready.games.cards.dice;

import com.stayready.stayready.Player;

import java.util.ArrayList;

public class DicePlayer extends Player {

    private Double money;

    public DicePlayer(String name,Double money) {
        super(name);
        this.money = money;

    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
