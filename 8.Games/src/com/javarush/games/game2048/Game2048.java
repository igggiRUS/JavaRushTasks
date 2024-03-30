package com.javarush.games.game2048;

import com.javarush.engine.cell.*;

public class Game2048 extends Game {

    private static int SIDE = 4;

    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
        drawScene();
        createNewNumber();
        createNewNumber();

    }

    private int[][] gameField = new int[4][4];

    private void createGame() {

    }

    private void drawScene() {
        setCellColor(0, 0, Color.RED);

        setCellColor(1, 0, Color.RED);
        setCellColor(0, 1, Color.RED);
        setCellColor(1, 1, Color.RED);
        setCellColor(2, 1, Color.RED);
        setCellColor(3, 1, Color.RED);


        setCellColor(2, 0, Color.RED);
        setCellColor(0, 2, Color.RED);
        setCellColor(1, 2, Color.RED);
        setCellColor(2, 2, Color.RED);
        setCellColor(3, 2, Color.RED);


        setCellColor(3, 0, Color.RED);
        setCellColor(0, 3, Color.RED);
        setCellColor(1, 3, Color.RED);
        setCellColor(2, 3, Color.RED);
        setCellColor(3, 3, Color.RED);

    }

    private void createNewNumber() {
        getRandomNumber(SIDE);
        getRandomNumber(SIDE);
        if (getRandomNumber(10) == 9) {
            SIDE = 4;
        } else {
            SIDE = 2;
        }
//        int x = getRandomNumber(SIDE);
//        int y = getRandomNumber(SIDE);


    }
}