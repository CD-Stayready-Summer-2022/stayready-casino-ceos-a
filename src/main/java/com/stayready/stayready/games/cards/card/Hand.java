package com.stayready.stayready.games.cards.card;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;

    public Hand(){
        this.cards = new ArrayList<>();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public Boolean valueOfCardInHand(CardValue value){

        for(Card card:cards){
            if(card.getValue().equals(value)){
                return true;
            }
        }
        return false;
    }
    public ArrayList<Card> getMatches(CardValue value ) {
        ArrayList<Card> matches = new ArrayList<>();
        for(Card card:cards){
            if(card.getValue().equals(value)){
                matches.add(card);
            }
        }
        return matches;
    }
    public void hasMatchingSet() {

    }

    public void giveCardToHand(Card card){
        cards.add(card);
    }

    public boolean cardIsInHand(Card card){
        return cards.contains(card);

    }

    public Card getCardFromHand(Card card){
        int indexOfCard = cards.indexOf(card);
        Card cardRemoved = cards.get(indexOfCard);
        cards.remove(indexOfCard);
        return cardRemoved;
    }
    public Integer getSize(){
        cards.size();
       return cards.size();
    }
}
