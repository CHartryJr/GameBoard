package com.hartrytech.llc.Game.Scripts.Board;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Menus extends Application
{

    @Override
    public void start(Stage menusStage) throws Exception 
    {
        Group root = new Group();
        Scene scene = new Scene(root);
        menusStage.setScene(scene);
        menusStage.show(); 
    }

    public void start(String [] args) 
    {
        Application.launch(args);
    }
    
}
