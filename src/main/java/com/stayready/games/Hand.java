package com.stayready.games;

import com.stayready.Deck;


public class Hand {
    private CardGame[] player;
    private CardGame[] dealer;
    private int[] CardValue;
    Hand(Deck d, int round)
    {
        CardValue = new int[round+3];
        player = new CardGame[round+2];
        dealer = new CardGame[round+2];
        //(round+2) is the handsize at any given time
        for (int x=0; x<round+3; x++)
        {
            player[x] = d.deal(7); //fills up one hand.
            dealer[x] = d.deal(7); //fills up second hand.
        }
    }
}

