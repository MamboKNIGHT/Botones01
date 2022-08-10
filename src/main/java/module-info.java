module com.example.botones01 {
    requires javafx.controls;
    requires javafx.fxml;


    opens Controlador to javafx.fxml;
    exports Controlador;
}