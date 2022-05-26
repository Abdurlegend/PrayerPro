package com.example.prayerpro;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;

public class HelloApplication extends Application {
    static ComboBox<String> SelectPrayer;
    static ComboBox<String> SelectTheme;
    static TableView prayerlist;
    static GridPane pane;



    public void start(Stage primaryStage) throws IOException {
        primaryStage.setTitle("PrayerPro");
        primaryStage.setMinHeight(300);
        Label Prayerpro = new Label("Welcome to Prayer Pro");
        VBox dropdownlist = new VBox();
        SelectPrayer = new ComboBox<>();
        SelectPrayer.getItems().addAll("Montreal" , "Toronto", "New york");
        SelectPrayer.setValue("Montreal");
        SelectPrayer.setMinWidth(100);
        Button btn= new Button("Apply city setting");;
        btn.setOnAction(e -> userCityControl.refresh());
        Button btnTheme= new Button("Apply theme setting");;
        btnTheme.setOnAction(e -> userThemeControl.refresh());

        dropdownlist.getChildren().addAll(SelectPrayer);



        SelectTheme = new ComboBox<>();
        SelectTheme.getItems().addAll("Light Theme" , "Dark Theme");
        SelectTheme.setValue("Light Theme");
        SelectTheme.setMinWidth(100);

        // Wrapping a vbox around a table which contains the prayer times for a selected city
        VBox vbox = new VBox();
         prayerlist = new TableView<>();


        TableColumn<Prayer, String> column1 =
                new TableColumn<>("Prayer Name");

        column1.setCellValueFactory(
                new PropertyValueFactory<>("prayerName"));


        TableColumn<Prayer, String> column2 =
                new TableColumn<>("Prayer Time");

        column2.setCellValueFactory(
                new PropertyValueFactory<>("prayerTime"));

        prayerlist.setMinWidth(350);
        prayerlist.setMaxHeight(200);

        prayerlist.getColumns().add(column1);
        prayerlist.getColumns().add(column2);

        prayerlist.getItems().addAll(PrayerSyncService.dailyPrayers);
        vbox.getChildren().addAll(prayerlist);

        pane = new GridPane();
        pane.add(dropdownlist, 1, 0);
        pane.add(btn,1,2);
        pane.add(vbox, 1,1);
        pane.add(SelectTheme, 2,3);
        pane.add(btnTheme, 2,4);

        //Setting the vertical and horizontal gaps between the columns
        pane.setVgap(5);
        pane.setHgap(5);

        //Setting the Grid alignment
        pane.setAlignment(Pos.CENTER);

        Scene scene= new Scene(pane);
        scene.getStylesheets().add("PrayerPro.css");
        primaryStage.setScene(scene);
        primaryStage.setTitle("Prayer Notification");
        primaryStage.show();
    }

    public static void main(String[] args) throws FileNotFoundException, ParseException {
        launch(args);
    }

    public static String getSelectedCity(){
        return SelectPrayer != null ? SelectPrayer.getValue() : "Montreal"; // DEFAULT VALUE IS MONTREAL
    }

    public static String getSelectedTheme(){
        return SelectTheme != null ? SelectTheme.getValue() : "Light Theme"; // DEFAULT VALUE IS LIGHT
    }

    public static void applyLightTheme(){
        pane.setStyle("-fx-background-color:#ffdead");
    }

    public static void applyDarkTheme(){
        pane.setStyle("-fx-background-color:#404040");
        pane.setOpacity(40);
    }

    /*public static String getSelectedTheme() {
        return ColorPicker;
    }

     */


    public static  void updatePrayerTimingsTable(List<Prayer> newTimings){
        if(prayerlist != null){
            prayerlist.getItems().clear();
            prayerlist.getItems().addAll(PrayerSyncService.dailyPrayers);
        }
    }




}

