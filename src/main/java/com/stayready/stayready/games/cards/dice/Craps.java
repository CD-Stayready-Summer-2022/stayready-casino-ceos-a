package com.stayready.stayready.games.cards.dice;

import com.stayready.stayready.games.cards.BlackJack;
import com.stayready.stayready.games.cards.Game;
import com.stayready.stayready.games.cards.card.CardPlayer;
import com.stayready.stayready.games.cards.card.CardValue;

import java.util.ArrayList;
import java.util.Scanner;

public class Craps implements Game {
    private DicePlayer player1;
    private DicePlayer player2;
    private Dice dice;
    private Scanner scanner;
    private static final Double MIN_BET = 10.0;
    private static final Double MAX_BET = 500.0;

    public Craps(DicePlayer player1, DicePlayer player2) {
        this.dice = new Dice();
        this.player1 = player1;
        this.player2 = player2;
        scanner = new Scanner(System.in);
    }


    public Boolean winningRole(Dice dice) {
        if (dice.getTotalValueOfDice() == 7 || dice.getTotalValueOfDice() == 11) {
            return true;
        }
        return false;
    }

    public Boolean crapsRoll(Dice dice) {
        if (dice.getTotalValueOfDice() == 2 || dice.getTotalValueOfDice() == 12 || dice.getTotalValueOfDice() == 3) {
            return true;
        }
        return false;
    }

    @Override
    public void startGame() {
        Boolean gameOver = false;
        while (!gameOver) {
            promptUserToPlay(player1);
            promptUserToPlay(player2);
            gameOver = true;
        }
    }
    public void promptUserToPlay(DicePlayer player) {
        String msg = String.format("Hey, %s press any number to roll dice ", player.getName());
        System.out.println(msg);
        Integer input = scanner.nextInt();
        dice.rollDice();
        System.out.println("you rolled " + dice.getTotalValueOfDice());
        if (winningRole(dice)) {
            System.out.println("you won the roll");
        }
        if(crapsRoll(dice)) {
            System.out.println("you lost the roll ");
        }

    }



    public DicePlayer getPlayer1() {
        return player1;
    }

    public DicePlayer getPlayer2() {
        return player2;
    }

    public Dice getDice() {
        return dice;
    }
}
