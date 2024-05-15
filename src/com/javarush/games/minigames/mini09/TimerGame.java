package com.javarush.games.minigames.mini09;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

/* 
Таймер
*/

public class TimerGame extends Game {

    @Override
    public void initialize() {
        setScreenSize(3, 3);
        setTurnTimer(1000);
    }

    //напишите тут ваш код

    @Override
    public void onTurn(int step) {
        Color color;
        if (step%2==0) {
            setCellNumber(1,1,step);
            color = Color.GREEN;
        }
        else {
            setCellNumber(1,1,step);
            color = Color.ORANGE;
        }
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++){
                setCellColor(i,j,color);
            }
        }
    }
}
