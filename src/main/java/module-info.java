module com.example.prayerpro {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.prayerpro to javafx.fxml;
    exports com.example.prayerpro;
}