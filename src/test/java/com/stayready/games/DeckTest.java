package com.stayready.games;


import com.stayready.stayready.stayready.games.cards.deck.Deck;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DeckTest {
    @Test

    public void constructorTest(){
        //Given
        Deck deck = new Deck();
        //When
        Integer expected = 52;
        Integer actual = deck.cardsRemaining();
        //Then
        Assertions.assertEquals(expected, actual);
    }
}
