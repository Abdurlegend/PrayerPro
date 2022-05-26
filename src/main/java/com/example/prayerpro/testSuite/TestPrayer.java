package com.example.prayerpro.testSuite;

import com.example.prayerpro.Prayer;
import com.example.prayerpro.UserPreferences;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TestPrayer {
    @Test
    void testPrayer(){
        Prayer prayer = new Prayer("Farj", "3:00");
        assertEquals("Prayer name value " , prayer.getPrayerName(), "Farj");
        assertEquals("Prayer time Value" , prayer.getPrayerTime(), "3:00");
    }
}
