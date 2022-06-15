package com.stayready.stayready.games.cards;


import com.stayready.stayready.games.cards.card.Card;
import com.stayready.stayready.games.cards.card.CardGame;
import com.stayready.stayready.games.cards.card.CardPlayer;
import com.stayready.stayready.games.cards.card.Hand;

import java.util.Scanner;

public class BlackJack extends CardGame {

    private final static Integer NUMBER_TO_DEAL = 7;
    private CardPlayer player1;
    private CardPlayer player2;
    private Scanner scanner;

    public BlackJack(CardPlayer player1, CardPlayer player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.scanner = new Scanner(System.in);

    }

    @Override
    public void startGame() {
        boolean gameOver = false;
        deal();
        while (!gameOver) {
            promptUserToPlay(player1);
            promptUserToPlay(player2);
            if (BlackJack.busted(player1.getHand())) {
                gameOver = true;
                System.out.println("Player 2 wins");
            }
            if (BlackJack.busted(player2.getHand())) {
                gameOver = true;
                System.out.println("Player 1 wins");
            }
            if (player1.getHand().getTotalValueOfHand() == 21) {
                gameOver = true;
                System.out.println("Player one wins");
            }
            if (player2.getHand().getTotalValueOfHand()
                    == 21) {
                gameOver = true;
                System.out.println("Player two wins");
            }

        }
    }

    private void promptUserToPlay(CardPlayer player1) {
        String msg = String.format("Hey, %s?", player1.getName());
        System.out.println(msg);

    }


    public void deal() {
        for (int x = 0; x < NUMBER_TO_DEAL; x++) {
            Card card1 = deck.takeCardFromDeck();
            player1.getHand().giveCardToHand(card1);

            Card card2 = deck.takeCardFromDeck();
            player2.getHand().giveCardToHand(card2);
        }
    }

        public static Boolean busted (Hand hand){
            if (hand.getTotalValueOfHand() > 21) {
                return true;
            }
            return false;

        }

    }


