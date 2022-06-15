package com.stayready.games.cards;

import com.stayready.stayready.games.cards.BlackJack;
import com.stayready.stayready.games.cards.card.Card;
import com.stayready.stayready.games.cards.card.CardSuit;
import com.stayready.stayready.games.cards.card.CardValue;
import com.stayready.stayready.games.cards.card.Hand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BlackJackTest {
    @Test
    @DisplayName("BlackJack bust test")

    public void getBustedTest(){
        Hand hand = new Hand();
        Card card = new Card(CardValue.TWO, CardSuit.SPADE);
        hand.giveCardToHand(card);
        Assertions.assertFalse(BlackJack.busted(hand));

    }

    @Test
    @DisplayName("BlackJack busted second test")
    public void bustedTest02(){
        Hand hand = new Hand();
        Card card = new Card(CardValue.KING, CardSuit.SPADE);
        Card card2 = new Card(CardValue.KING, CardSuit.SPADE);
        Card card3 = new Card(CardValue.KING, CardSuit.SPADE);
        hand.giveCardToHand(card);
        hand.giveCardToHand(card2);
        hand.giveCardToHand(card3);
        Assertions.assertTrue(BlackJack.busted(hand));
    }
}
