package com.hartrytech.llc.Game.Scripts.Board;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;

import javafx.stage.Stage;

public class Menus extends Application
{
    private static Scene scene;
    
    @Override
    public void start(Stage stage) throws IOException 
    {
        Parent root = FXMLLoader.load(getClass().getResource("fxml/MainMenus.fxml"));
        scene = new Scene(root,500,500);
        stage.setTitle("Game Menus - Heartree Games");
        stage.setResizable(false);
        stage.setScene(scene);
        scene.getStylesheets().add(getClass().getResource("Styles/format.css").toExternalForm());
        stage.show();
    }
    
    public void startGame() 
    {
        Application.launch();
    }
   

}
