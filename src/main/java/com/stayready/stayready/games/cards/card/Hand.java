package com.stayready.stayready.games.cards.card;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public Boolean valueOfCardInHand(CardValue value) {

        for (Card card : cards) {
            if (card.getValue().equals(value)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Card> getMatches(CardValue value) {
        ArrayList<Card> matches = new ArrayList<>();

        for (int i=0;i<cards.size();i++) {
            if (cards.get(i).getValue().equals(value)) {
                cards.remove(i);

                matches.add(cards.get(i));
            }
        }
        return matches;
    }

    public Boolean hasMatchingSet() {
        for (CardValue value : CardValue.values()) {
            int count = 0;
            for (Card card : cards) {
                if (card.getValue().name.equals(value.name)) {
                    count++;
                }
            }
            if (count == 4) {
                return true;
            }

        }
        return false;
    }


    public void giveCardsToHand(ArrayList<Card> cards) {
        this.cards.addAll(cards);
    }


    public void giveCardToHand(Card card) {
        cards.add(card);

    }

    public boolean cardIsInHand(Card card) {
        return cards.contains(card);

    }


    public Card getCardFromHand(Card card) {

        int indexOfCard = cards.indexOf(card);
        Card cardRemoved = cards.get(indexOfCard);
        cards.remove(indexOfCard);
        return cardRemoved;
    }
    public Integer getSize(){

       return cards.size();
    }
}

