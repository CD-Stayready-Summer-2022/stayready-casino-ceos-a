package com.stayready.games.cards.card;

import com.stayready.games.Game;
import com.stayready.games.deck.Deck;

public abstract class CardGame implements Game {
    protected Deck deck;

    public CardGame(){
        this.deck = new Deck();
        deck.shuffle();
    }
}

