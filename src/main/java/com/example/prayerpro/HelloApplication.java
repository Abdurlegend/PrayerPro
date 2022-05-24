package com.example.prayerpro;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class HelloApplication extends Application {



    private Scene scene1;
    private HBox root;
    //private Button btn1;


    private VBox vbox;
    //private Button btn2;




    public void start(Stage primaryStage) throws IOException {


        primaryStage.setTitle("PrayerPro");
        primaryStage.setHeight(800);
        primaryStage.setWidth(800);
        primaryStage.setMinWidth(200);
        primaryStage.setResizable(false);

        //Label Prayerpro = new Label("PrayerPro");
        //btn1= new Button("prayer alert");
        //btn1.setOnAction(e -> primaryStage.setScene(scene2));

        root = new HBox();
        VBox dropdownlist = new VBox();
        ComboBox<String> SelectPrayer = new ComboBox<>();
        SelectPrayer.getItems().addAll("Montreal" , "Toronto", "New York");
        TextField userInput = new TextField();
        dropdownlist.getChildren().add(SelectPrayer);
        root.getChildren().addAll(dropdownlist);

        VBox Checkbox = new VBox();
        CheckBox allowNotification = new CheckBox("Yes");
        CheckBox disallowNotification = new CheckBox("no");
        Checkbox.setAlignment(Pos.TOP_LEFT);
        Checkbox.getChildren().addAll(allowNotification, disallowNotification);
        root.getChildren().add(Checkbox);


        scene1= new Scene(root);





        // creating second scene

        vbox = new VBox();
        TableView prayerlist = new TableView<>();


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



        //scene2 = new Scene(vbox);
        //btn2= new Button("list of 5 daily prayers and thier times");
       // btn2.setOnAction(e -> primaryStage.setScene(scene1));

        root.getChildren().addAll(vbox);




        // SelectPrayer.promptTextProperty().bind(prayer.setUserCityControl());





        primaryStage.setScene(scene1);
        primaryStage.setTitle("Prayer Notification");
        primaryStage.show();



    }



    public static void main(String[] args) throws FileNotFoundException, ParseException {
        PrayerSyncService.syncPrayersFromtextfile();
        launch(args);
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
