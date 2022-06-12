package com.stayready.stayready.stayready.games.cards.card;


import com.stayready.stayready.stayready.Player;

public class CardPlayer extends Player {
    private Hand hand;

    public CardPlayer(String name) {
        super(name);
        this.hand = new Hand();
    }

    public Hand getHand() {
        return hand;
    }

}
