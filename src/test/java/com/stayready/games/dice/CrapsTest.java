package com.stayready.games.dice;

import com.stayready.stayready.Player;
import com.stayready.stayready.games.cards.dice.Craps;
import com.stayready.stayready.games.cards.dice.Dice;
import com.stayready.stayready.games.cards.dice.DicePlayer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CrapsTest {
    @Test
    @DisplayName("Craps constructor test")
    public void constructorTest() {
        DicePlayer player1 = new DicePlayer("Steve", 100.0);
        DicePlayer player2 = new DicePlayer("George", 150.0);
        Craps crapsGame = new Craps(player1, player2);
        Assertions.assertNotNull(crapsGame);
    }

    @Test
    @DisplayName("winning role Test")
    public void winningRoleTest() {
        DicePlayer player1 = new DicePlayer("Steve", 100.0);
        DicePlayer player2 = new DicePlayer("George", 150.0);
        Craps crapsGame = new Craps(player1, player2);
        Dice dice = crapsGame.getDice();
        dice.rollDice();
        // unfinished test
    }


}
