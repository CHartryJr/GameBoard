package com.hartrytech.llc.Game.Scripts.Board.fxml;

import java.io.IOException;
import com.hartrytech.llc.Game.Scripts.Board.Menus;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

/**
 * Is a class that will be used to control the scene behaviors
 */
public class Controller 
{
     @FXML
     public void switchScene(String sceneName) 
    {
        try 
        {
            Menus.setRoot(sceneName);
        } 
        catch (IOException e) 
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
   
    public void games(ActionEvent e)
    {
        switchScene("Games");
    }
    public void  credits(ActionEvent e)
    {
        switchScene("Credits");
    }
    public void settings(ActionEvent e)
    {
        switchScene("Settings");
    }
}
