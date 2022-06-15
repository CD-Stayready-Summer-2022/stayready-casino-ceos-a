package com.stayready.stayready.games.cards.dice;

import java.util.Random;

public class Die {
    private Integer value;
    Random random = new Random();

    public Die() {
        this.value = value;
    }

    public Integer getValue() {
        return this.value;
    }

    public Integer roll() {
        this.value = random.nextInt(1, 6);
        return this.value;
    }

}
