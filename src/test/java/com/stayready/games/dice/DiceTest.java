package com.stayready.games.dice;

import com.stayready.stayready.games.cards.dice.Dice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DiceTest {
    @Test
    @DisplayName("Dice Constructor Test")
    public void constructorTest() {
        Dice dice = new Dice();
        Integer expected =2;
        Integer actual = dice.getDieAmount();
        Assertions.assertEquals(expected,actual);
    }


}
