package com.springCourse.learnspringframework;

import game.GameRunner;
import game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {

       // var marioGame = new MarioGame();
        var scGame = new SuperContraGame();


        var gameRunner = new GameRunner(scGame);
        gameRunner.run();

    }

}
