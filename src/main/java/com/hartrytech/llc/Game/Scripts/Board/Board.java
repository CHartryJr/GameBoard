package com.hartrytech.llc.Game.Scripts.Board;
import com.hartrytech.llc.Game.Scripts.Board.Layout.Layout;
import javafx.application.Application;
import javafx.stage.Stage;

class Board
{
    private static boolean first = true;
    private Layout currentLayout;
    public Board (Layout gameLayout)
    {
        if(!first)
         first = false;
        else
         throw new InstantiationError("can not make More than one instance");
        currentLayout = gameLayout;
    }
   
}
