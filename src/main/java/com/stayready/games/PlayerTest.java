package com.stayready.games;

import com.stayready.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.testng.annotations.Test;

public class PlayerTest {
    @Test
    @DisplayName("no parameter constructor test")
    public void constructorTest010(){

        Player play=new Player("abdul",20,120000.23);
        String actualPlayer= play.getName();
        Assertions.assertNotNull(actualPlayer);
    }
    @Test
    @DisplayName("no parameter constructor test")
    public void constructorTest020(){

        Player play1=new Player("abdul",20,120000.23);
        String expected="abdul";
        String actualPlayer= play1.getName();
        String actual=String.format("%s", "abdul");
        Assertions.assertEquals(expected, actual);
    }
    }



