package com.stayready.games;

import com.stayready.stayready.games.cards.card.Card;
import com.stayready.stayready.games.cards.card.CardSuit;
import com.stayready.stayready.games.cards.card.CardValue;
import com.stayready.stayready.games.cards.card.Hand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HandTest {
    @Test
    @DisplayName("value of hand test")

    public void constructerTest(){
        Hand hand=new Hand();
        Assertions.assertNotNull(hand);
    }
    @Test
    @DisplayName("value of card in hand")
    public void valueOfCardInHandTest(){
        Hand hand=new Hand();
        Card card=new Card(CardValue.TWO, CardSuit.SPADE);
        hand.giveCardToHand(card);

        Assertions.assertTrue(hand.valueOfCardInHand(CardValue.TWO));
    }
    @Test
    @DisplayName("give card to hanf")
    public void giveCardToHandTest(){
        Hand hand=new Hand();
        Card card=new Card(CardValue.TWO, CardSuit.SPADE);
        hand.giveCardToHand(card);
        Integer expected=1;
        Integer actual=hand.getSize();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("get card from hand")
    public void getCardFromHandTest(){
        Hand hand=new Hand();
        Card card=new Card(CardValue.TWO, CardSuit.SPADE);
        /*hand.giveCardToHand(1);
        hand.getCardFromHand(h);*/
        Integer expected=0;
        Integer actual=hand.getSize();
        Assertions.assertEquals(expected, actual);
    }

}
