package com.stayready.games;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CardTest {

    @Test
    @DisplayName("constructor test")
    public void constructorTest01() {
        Card card = new Card("Spade", 7);
        String expected = "Spade " + 7;
        String actual = String.format("%s %d", card.getSuit(), card.getValue());
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Suit setter test")
    public void setSuitTest() {
        //Given
        Card card = new Card("Spade", 7);
        card.setSuit("Hearts");
        String expected = "Hearts";
        //When
        String actual = card.getSuit();
        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Value setter test")
    public void setValueTest() {
        //Given
        Card card = new Card("Spade", 7);
        card.setValue(9);
        Integer expected = 9;
        //When
        Integer actual = card.getValue();
        // Then
        Assertions.assertEquals(expected, actual);
    }

}
