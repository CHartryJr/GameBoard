package com.hartrytech.llc.Game.Scripts.Board;

import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Menus extends Application
{

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException 
    {
        Group root = new Group();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    public void startGame() 
    {
        Application.launch();
    }
    
}
