package com.stayready.games;

import com.stayready.Player;

public abstract class CardGame {
    private Player player;
    private Player dealer;

    public CardGame(Player player,Player dealer) {
        this.player = player;
        this.dealer = dealer;
    }


}
