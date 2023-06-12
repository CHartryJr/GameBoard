package com.hartrytech.llc;

import java.io.IOException;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        GameDemo.setRoot("primary");
    }
}