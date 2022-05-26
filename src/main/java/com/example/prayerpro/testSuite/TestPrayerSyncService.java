package com.example.prayerpro.testSuite;

import com.example.prayerpro.PrayerSyncService;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.text.ParseException;

import static org.testng.AssertJUnit.assertEquals;

public class TestPrayerSyncService {
        @Test
        void SyncPrayersFromTextFile_test() {
            try{
                PrayerSyncService.syncPrayersFromtextfile();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (ParseException e) {
                e.printStackTrace();
            }

            assertEquals("Prayers Synced", 5, PrayerSyncService.dailyPrayers.size());
        }
    }
