package com.example.prayerpro;

public class UserPreferences {
    static String citySelected = "";
    static String themeSelected = "";

    public UserPreferences(){}

    public UserPreferences(String city, String theme){
        this.citySelected = city;
        this.themeSelected = theme;
    }

    public static void setCity(String value) {
        citySelected = value;
    }

    public static void setTheme(String value) {
        themeSelected = value;
    }

    public static String getCitySelected() {
        return citySelected;
    }

    public static String getThemeSelected() {
        return themeSelected;
    }

}
