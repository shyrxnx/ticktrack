module com.example.ticktrack {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
                    requires org.kordamp.ikonli.javafx;
                
    opens com.example.ticktrack to javafx.fxml;
    exports com.example.ticktrack;
}