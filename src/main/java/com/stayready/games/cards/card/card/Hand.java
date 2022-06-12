package com.stayready.games.cards.card.card;

import com.stayready.games.cards.card.Card;

import java.util.ArrayList;

public class Hand {
    private ArrayList<com.stayready.games.cards.card.Card> cards;

    public Hand(){
        this.cards = new ArrayList<>();
    }

    public ArrayList<com.stayready.games.cards.card.Card> getCards() {
        return cards;
    }

    public Boolean valueOfCardInHand(){
        return null;
    }

    public void giveCardToHand(com.stayready.games.cards.card.Card card){
        cards.add(card);
    }

    public boolean cardIsInHand(com.stayready.games.cards.card.Card card){
        return cards.contains(card);
    }

    public com.stayready.games.cards.card.Card getCardFromHand(com.stayready.games.cards.card.Card card){
        int indexOfCard = cards.indexOf(card);
        Card cardRemoved = cards.get(indexOfCard);
        cards.remove(indexOfCard);
        return cardRemoved;
    }
}
