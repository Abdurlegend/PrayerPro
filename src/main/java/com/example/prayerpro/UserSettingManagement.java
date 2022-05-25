package com.example.prayerpro;

import javafx.beans.value.ObservableValue;

import java.io.FileNotFoundException;
import java.text.ParseException;

public class UserSettingManagement {
    private static String citySelected = "";
    private static String themeSelected = "";
    private static Boolean dailyReminderSelected;

    public static void setCity(String value){
        citySelected = value;
    }

    public static String getCitySelected(){return  citySelected;}
}
