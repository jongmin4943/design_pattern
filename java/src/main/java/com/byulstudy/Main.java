package com.byulstudy;

import com.byulstudy.controller.GameController;
import com.byulstudy.controller.RPGGameController;

public class Main {
    public static void main(String[] args) {
        GameController gameController = new RPGGameController();
        gameController.start();
    }
}