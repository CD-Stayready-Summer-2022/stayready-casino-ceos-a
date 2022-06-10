package com.stayready.games;


import com.stayready.Deck;
import com.stayready.Player;
import com.stayready.games.cards.card.Card;

public class GoFish extends CardGame {
    public GoFish(Player player, Player dealer) {
        super(player, dealer);
    }

    @Override
    public void startGame() {
        Deck deck = new Deck();
        deck.shuffle();
        int count = 0;
        while (count<=7) {

        }
    }


}