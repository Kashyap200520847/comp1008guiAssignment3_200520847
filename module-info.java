module com.example.finalassignment {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.finalassignment to javafx.fxml;
    exports com.example.finalassignment;
}