package com.stayready.stayready.games.cards;


import com.stayready.stayready.games.cards.card.CardPlayer;
import com.stayready.stayready.games.cards.dice.Craps;
import com.stayready.stayready.games.cards.dice.Dice;
import com.stayready.stayready.games.cards.dice.DicePlayer;

import java.util.Scanner;

public class Casino {
    private Scanner scanner;

    public Casino() {
        scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Player 1 whats is your name?");
        String name1 = scanner.next();
        System.out.println("Player 2 whats is your name?");
        String name2 = scanner.next();
        Craps craps = new Craps(new DicePlayer(name1, 100.0), new DicePlayer(name2, 100.0));
        GoFish goFish = new GoFish(new CardPlayer(name1), new CardPlayer(name2));
        // goFish.startGame();
        craps.startGame();
    }

    public static void main(String[] args) {
        new Casino().start();
    }

}
