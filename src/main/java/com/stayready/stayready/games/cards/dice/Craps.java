package com.stayready.stayready.games.cards.dice;

import com.stayready.stayready.games.cards.Game;

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
        if (this.dice.getTotalValueOfDice() == 7 || this.dice.getTotalValueOfDice() == 11) {
            return true;
        }
        return false;
    }

    public Boolean crapsRoll(Dice dice) {
        if (this.dice.getTotalValueOfDice() == 2 || this.dice.getTotalValueOfDice() == 12 || this.dice.getTotalValueOfDice() == 3) {
            return true;
        }
        return false;
    }

    @Override
    public void startGame() {

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
