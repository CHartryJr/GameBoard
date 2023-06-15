package com.hartrytech.llc.Games.Scripts.Board.fxml;

import java.io.IOException;

import com.hartrytech.llc.Games.Scripts.Board.Menus;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

/**
 * Is a class that will be used to control the scene behaviors
 */
public class Controller 
{
   
    public void home(ActionEvent e)
    {
        Menus.switchScene("MainMenus");
        System.out.println(e);
    }
    public void games(ActionEvent e)
    {
        Menus.switchScene("Games");
    }
    public void  credits(ActionEvent e)
    {
        Menus.switchScene("Credits");
    }
    public void settings(ActionEvent e)
    {
        Menus.switchScene("Settings");
    }
}
