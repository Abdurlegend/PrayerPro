package com.example.prayerpro;

import javafx.application.Application;
import javafx.geometry.Insets;
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
    static TableView prayerlist;

    public void start(Stage primaryStage) throws IOException {


        primaryStage.setTitle("PrayerPro");
        primaryStage.setHeight(800);
        primaryStage.setWidth(800);
        primaryStage.setMinWidth(200);
        primaryStage.setResizable(false);

        Label Prayerpro = new Label("Welcome to Prayer Pro");


        VBox dropdownlist = new VBox();
        SelectPrayer = new ComboBox<>();
        Label citySelection = new Label("Choose a city");
        SelectPrayer.getItems().addAll("Montreal" , "Toronto", "New york");
        SelectPrayer.setValue("Montreal");
        Button btn= new Button("Select a city");;
        btn.setOnAction(e -> userCityControl.refresh());
        dropdownlist.getChildren().addAll(SelectPrayer);


        HBox Checkbox = new HBox();
        Label alertbox = new Label("Would you like to recieve daily notifications");
        CheckBox allowNotification = new CheckBox("Yes");
        CheckBox disallowNotification = new CheckBox("no");
        Checkbox.setAlignment(Pos.TOP_LEFT);
        Checkbox.getChildren().addAll(allowNotification, disallowNotification);

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


        prayerlist.getColumns().add(column1);
        prayerlist.getColumns().add(column2);

        prayerlist.getItems().addAll(PrayerSyncService.dailyPrayers);
        vbox.getChildren().addAll(prayerlist);

        GridPane grid= new GridPane();
        grid.add(dropdownlist, 1, 0);
        grid.add(btn,2,0);
        grid.add(Checkbox, 4, 0);
        grid.add(vbox, 2,1);
        grid.add(citySelection,0 ,0);
        grid.add(alertbox,3,0);

        // Setting Padding
        grid.setPadding(new Insets(10, 10, 10, 10));

        //Setting the vertical and horizontal gaps between the columns
        grid.setVgap(5);
        grid.setHgap(5);

        //Setting the Grid alignment
        grid.setAlignment(Pos.CENTER);

        Scene scene= new Scene(grid);
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

    public static  void updatePrayerTimingsTable(List<Prayer> newTimings){
        if(prayerlist != null){
            prayerlist.getItems().clear();
            prayerlist.getItems().addAll(PrayerSyncService.dailyPrayers);
        }
    }

    /*private static void populatePrayerTimingsUI(Stage primaryStage){
        TableView tableView = new TableView();

        TableColumn<Prayer, String> column1 =
                new TableColumn<>("Prayer Name");

        column1.setCellValueFactory(
                new PropertyValueFactory<>("prayerName"));


        TableColumn<Prayer, String> column2 =
                new TableColumn<>("Prayer Time");

        column2.setCellValueFactory(
                new PropertyValueFactory<>("prayerTime"));


        tableView.getColumns().add(column1);
        tableView.getColumns().add(column2);

        tableView.getItems().addAll(PrayerSyncService.dailyPrayers);


    }*/


}
