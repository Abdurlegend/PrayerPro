module com.example.prayerpro {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.testng;


    opens com.example.prayerpro to javafx.fxml;
    exports com.example.prayerpro;
}