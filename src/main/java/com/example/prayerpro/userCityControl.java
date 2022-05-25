package com.example.prayerpro;

import java.io.FileNotFoundException;
import java.text.ParseException;

public class userCityControl implements UIControl {

    public static void refresh(){
        setSetting();
        execute();
    }

    public static void setSetting(){
        UserSettingManagement.setCity(
                HelloApplication.getSelectedCity().replaceAll(" ", "")
        );
    }

    public static void execute(){
        try{
            PrayerSyncService.syncPrayersFromtextfile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
