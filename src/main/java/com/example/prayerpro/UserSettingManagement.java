package com.example.prayerpro;

import javafx.beans.value.ObservableValue;

public class UserSettingManagement {

    private static String citySelected = "Montreal";
    private static Boolean dailyReminder;

    public static String getCitySelected(){return  citySelected;}
    // SETTERS/GETTERS FOR THE ABOVE

    public ObservableValue<? extends String> setUserCityControl(){
        System.out.println("This line needs to hit");
        // ui create a dropdown list  (cities that we support)
        // updates the dropdown bind to that event
        // update a property, reinvock the sync service
        // bind drop downlist to this
        return null;
    }



    public void setuserDailyReminder(){
    }


}
