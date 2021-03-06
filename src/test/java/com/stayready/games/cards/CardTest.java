package com.stayready.games.cards;

import com.stayready.stayready.games.cards.card.Card;
import com.stayready.stayready.games.cards.card.CardSuit;
import com.stayready.stayready.games.cards.card.CardValue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CardTest {


    @Test
    @DisplayName("Card Constructor Test")
    public void constructorTest(){
        Card card = new Card(CardValue.ACE, CardSuit.SPADE);
        String expected = "Suit: Spade, Value: Ace";
        String actual = card.toString();
        Assertions.assertEquals(expected, actual);
    }



}
