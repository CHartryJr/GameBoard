package com.hartrytech.llc;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        GameDemo.setRoot("secondary");
    }
}
