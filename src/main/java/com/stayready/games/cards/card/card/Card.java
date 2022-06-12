package com.stayready.games.cards.card.card;

import com.stayready.games.cards.card.CardSuit;
import com.stayready.games.cards.card.CardValue;

import java.util.Objects;

public class Card {
    private com.stayready.games.cards.card.CardValue value;
    private com.stayready.games.cards.card.CardSuit suit;

    public Card(com.stayready.games.cards.card.CardValue value, com.stayready.games.cards.card.CardSuit suit){
        this.value = value;
        this.suit = suit;
    }

    public CardValue getValue() {
        return value;
    }

    public CardSuit getSuit() {
        return suit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return value == card.value && suit == card.suit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, suit);
    }

    @Override
    public String toString(){
        return String.format("Suit: %s, Value: %s", suit.name, value.name);
    }
}
