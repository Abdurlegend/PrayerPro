package com.example.prayerpro;

public class userThemeControl implements UIControl {

    public static void refresh() {
        setSetting();
        execute();
    }

    // This method is used for setting the background theme
    public static void setSetting() {
        UserSettingManagement.currentPreference.setTheme(
                HelloApplication.getSelectedTheme()
        );
    }

    // This method is used for getting the theme that the user has chosen in the dropdown list menu
    public static void execute(){
        if(UserSettingManagement.currentPreference.getThemeSelected().equals("Light Theme")){
            HelloApplication.applyLightTheme();
        }
        else{
            HelloApplication.applyDarkTheme();
        }
    }
}
