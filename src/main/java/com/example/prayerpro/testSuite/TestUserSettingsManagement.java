package com.example.prayerpro.testSuite;

import com.example.prayerpro.UserPreferences;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TestUserSettingsManagement {
    @Test
    void testUserSettings(){
        UserPreferences up = new UserPreferences("Toronto", "Light Theme");
        assertEquals("City Value" , up.getCitySelected(), "Toronto");
        assertEquals("Theme Value" , up.getThemeSelected(), "Toronto");
    }
}
