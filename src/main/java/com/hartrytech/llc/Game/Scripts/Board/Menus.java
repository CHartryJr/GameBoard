package com.hartrytech.llc.Game.Scripts.Board;

import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Menus extends Application
{
    private static Scene scene;
    private final int X_FRAME_SIZE = 500;
    private final int Y_FRAME_SIZE = 500;

    @Override
    public void start(Stage stage) throws IOException 
    {
        Group root = new Group();
        scene = new Scene(root,X_FRAME_SIZE,Y_FRAME_SIZE,Color.BLACK);
        stage.setTitle("Game Menus - Heartree Games");
        stage.setResizable(false);
        Text text = new Text((X_FRAME_SIZE/2)-30,Y_FRAME_SIZE/10,"Menu");
        text.setId("menustext");
        root.getChildren().add(text);

        stage.setScene(scene);
        stage.show();
    }
    
    public void startGame() 
    {
        Application.launch();
    }
    
}
