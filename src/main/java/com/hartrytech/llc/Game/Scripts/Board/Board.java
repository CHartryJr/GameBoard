package com.hartrytech.llc.Game.Scripts.Board;
import com.hartrytech.llc.Game.Scripts.Board.Layout.Layout;
import javafx.application.Application;
import javafx.stage.Stage;

public class Board extends Application
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
    @Override
    public void start(Stage arg0) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'start'");
    }
}
