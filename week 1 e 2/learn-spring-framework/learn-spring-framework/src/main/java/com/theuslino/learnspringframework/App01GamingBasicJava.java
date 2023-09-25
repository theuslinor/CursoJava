package com.theuslino.learnspringframework;

import com.theuslino.learnspringframework.game.GameRunner;
import com.theuslino.learnspringframework.game.MarioGame;
import com.theuslino.learnspringframework.game.PacmanGame;
import com.theuslino.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {
    public static void main(String[] args) {

        //var game = new MarioGame();
        //var game = new SuperContraGame();
        var game = new PacmanGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
