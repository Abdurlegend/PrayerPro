package com.example.prayerpro;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class PrayerSyncService {
    static List<Prayer> dailyPrayers = new ArrayList<Prayer>();
    public static void syncPrayersFromtextfile() throws FileNotFoundException, ParseException {
        String filename = null;
        Boolean isCitySelected =
                UserSettingManagement.getCitySelected() != null &&
                UserSettingManagement.getCitySelected().length() != 0;
        if(isCitySelected){
            filename = UserSettingManagement.getCitySelected() + "Prayertimes.txt";
        }

        File MtlPrayerTimes = new File("C:\\Users\\abdur\\IdeaProjects\\PrayerPro\\src\\main\\java\\prayerTimings\\" + filename);
        Scanner scanner = new Scanner(MtlPrayerTimes);
        Calendar today = Calendar.getInstance();
        today.set(Calendar.HOUR_OF_DAY, 0);

        while(scanner.hasNextLine()){
            String prayersOfOneDay = scanner.nextLine();
            String currentLineDate = prayersOfOneDay.substring(0, prayersOfOneDay.indexOf(" "));
            try{
                Date lineDate = new SimpleDateFormat("dd/MM/yyyy").parse(currentLineDate);
                Calendar cal = Calendar.getInstance();
                cal.setTime(lineDate);

                Boolean datesMatch = today.get(Calendar.DAY_OF_MONTH) == cal.get(Calendar.DAY_OF_MONTH);    // WE ASSUME THE TEXT FILES WILL ALWAYS BE OF CURRENT MONTH
                if(datesMatch){
                    String[] data = prayersOfOneDay.split(" ");

                    dailyPrayers.add(new Prayer("Fajr", data[4]));
                    dailyPrayers.add(new Prayer("Duhr", data[10]));
                    dailyPrayers.add(new Prayer("Asr", data[12]));
                    dailyPrayers.add(new Prayer("Maghrib", data[14]));
                    dailyPrayers.add(new Prayer("Isha", data[16]));
                }


            }
            catch(Exception ex){
                System.out.println(ex);
                //throw new Exception("Invalid text file - Invalid format/date provided");
            }


            // compare that date to today
            // populate all of our prayer timings

        }
    }

}
