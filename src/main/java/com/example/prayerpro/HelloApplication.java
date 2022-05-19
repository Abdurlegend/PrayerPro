package com.example.prayerpro;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        HBox root = new HBox();
        root.setMaxHeight(500);
        root.setMaxWidth(500);
        Scene scene = new Scene(root);
        stage.setTitle("PrayerPro");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}