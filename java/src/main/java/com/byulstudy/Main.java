package com.byulstudy;

import com.byulstudy.application.Game;
import com.byulstudy.application.RPGGame;

public class Main {
    public static void main(String[] args) {
        Game game = new RPGGame();
        game.start();
    }
}