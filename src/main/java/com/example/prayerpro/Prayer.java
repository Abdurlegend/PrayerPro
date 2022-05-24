package com.example.prayerpro;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class  Prayer {
    private String prayerName;
    private String prayerTime;  // STORE AT CALENDAR DATA TYPE IN FUTURE ITERATIONS

    public Prayer(String prayerName, String prayerTime){
        this.prayerName = prayerName;
        this.prayerTime = prayerTime;
    }

    public String getPrayerName(){
        return this.prayerName;
    }

    public String getPrayerTime(){
        return this.prayerTime;
    }



    //public abstract void callToPrayer();
}


