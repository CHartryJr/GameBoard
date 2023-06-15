package com.hartrytech.llc.Games.Scripts.Board;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
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
    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Menus.class.getResource("fxml/"+ fxml + ".fxml"));
        return fxmlLoader.load();
    }

}
