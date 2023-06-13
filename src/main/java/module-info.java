module com.hartrytech.llc {
    requires javafx.controls;
    requires javafx.fxml;
    
    opens com.hartrytech.llc to javafx.fxml;
    exports com.hartrytech.llc.Game.Scripts.Board;
    
}
