package com.javarush.games.game2048;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

public class MySuperGame extends Game {
    @Override
    public void initialize() {
        setScreenSize(3,3);
        showGrid(false);
        setCellValueEx(1,1, Color.BLUE, "x", Color.ORANGE,50);
    }
    public void setScreenSize(int width, int height){

    }
    public void  showGrid(boolean isShow) {

    }

}