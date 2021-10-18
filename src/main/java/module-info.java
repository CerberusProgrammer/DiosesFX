module com.example.diosesfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.diosesfx to javafx.fxml;
    exports com.example.diosesfx;
}