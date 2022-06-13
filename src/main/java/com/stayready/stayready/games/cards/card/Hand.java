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
            if(card.getValue().name.equals(value.name)){
                matches.add(card);
            }
        }
        return matches;
    }
    public Boolean hasMatchingSet() {
        for(CardValue value : CardValue.values()){
            int count = 0;
            for(Card card : cards){
                if(card.getValue().name.equals(value.name)){
                    count++;
                }
            }
            if(count == 4){
                return true;
            }

        }
        return false;


    }

    public void giveCardToHand(Card cards){



    }

    public boolean cardIsInHand(Card card){
        return cards.contains(card);

    }

    public Card getCardFromHand(ArrayList<Card> card){
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
