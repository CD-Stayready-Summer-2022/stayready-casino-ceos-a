package com.stayready.stayready.games.cards.dice;

import java.util.ArrayList;

public class Dice {
    private ArrayList<Die> dice;

    public Dice() {
        Die die1 = new Die();
        Die die2 = new Die();
        this.dice = new ArrayList<>();
        this.dice.add(die1);
        this.dice.add(die2);

    }

    public void rollDice() {
        for (Die die : dice) {
            die.roll();
        }
    }
    public Integer getDieAmount() {
        return dice.size();
    }

    public Integer getTotalValueOfDice() {
        return dice.get(0).getValue() + dice.get(1).getValue();
    }

}
