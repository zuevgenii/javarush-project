package com.javarush.games.game2048;

import com.javarush.engine.cell.*;

public class Game2048 extends Game {
    private static final int SIDE = 4;
    private int[][] gameField = new int[SIDE][SIDE];
    @Override
    public void initialize() {
        setScreenSize(SIDE,SIDE);
        createGame();
        drawScene();
    }
    private void createGame(){
        createNewNumber();
        createNewNumber();
    }
    private void drawScene(){
        for(int i=0;i<SIDE;i++){
            for(int j=0;j<SIDE;j++){
               setCellColoredNumber(i,j,gameField[j][i]);
            }
        }

    }
    private void createNewNumber(){
        int x;
        int y;
       do {
           x = getRandomNumber(SIDE);
           y = getRandomNumber(SIDE);
       } while (gameField[y][x]!=0);
        if (getRandomNumber(10)==9) gameField[y][x]=4;
        else gameField[y][x]=2;
    }
    private Color getColorByValue(int value){
        Color color = Color.AZURE;
        switch (value){
            case 0: {
                color = Color.WHITE;
                break;
            }
            case 2: {
                color = Color.ORANGE;
                break;
            }
            case 4: {
                color = Color.GREEN;
                break;
            }
            case 8: {
                color = Color.VIOLET;
                break;
            }
            case 16: {
                color = Color.BLUE;
                break;
            }
            case 32: {
                color = Color.RED;
                break;
            }
            case 64: {
                color = Color.INDIGO;
                break;
            }
            case 128: {
                color = Color.BLACK;
                break;
            }
            case 256: {
                color = Color.CHARTREUSE;
                break;
            }
            case 512: {
                color = Color.KHAKI;
                break;
            }
            case 1024: {
                color = Color.NAVAJOWHITE;
                break;
            }
            case 2048: {
                color = Color.TRANSPARENT;
                break;
            }

        }
        return color;
    }
    private void setCellColoredNumber(int x,int y,int value)
    {
      if (value==0) setCellValueEx(x,y,getColorByValue(value),"");
      else setCellValueEx(x,y,getColorByValue(value),Integer.toString(value));
    }
}