module com.example.javain {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javain to javafx.fxml;
    exports com.example.javain;
}