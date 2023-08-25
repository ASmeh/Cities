module com.example.cities {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cities to javafx.fxml;
    exports com.example.cities;
}