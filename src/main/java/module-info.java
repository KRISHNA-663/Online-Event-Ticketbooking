module com.example.swaram1 {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
                        requires org.kordamp.bootstrapfx.core;
            
    opens com.example.swaram1 to javafx.fxml;
    exports com.example.swaram1;
}