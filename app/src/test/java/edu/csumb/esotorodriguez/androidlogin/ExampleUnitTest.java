package edu.csumb.esotorodriguez.androidlogin;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    public void setup_test() {
        MainActivity.people.put("SamusAran", "SuperMetroid");
        MainActivity.people.put("Sonic06", "Tragedy=(");
        MainActivity.people.put("RockMan", "MMX");
        MainActivity.people.put("SMW1990", "GoodGame");
        MainActivity.people.put("AdvanceWars", "12+Years");
        MainActivity.people.put("Hello1232", "11-Years");
    }

    @Test
    public void mainActivity_checkUsernames() {
        setup_test();

        String nameClear = "SamusAran";
        String nameClear2 = "Sonic06";
        String nameFail = "SamusAr";
        String nameFail2 = "SandMan";

        assertTrue(MainActivity.checkUsername(nameClear));
        assertTrue(MainActivity.checkUsername(nameClear2));
        assertFalse(MainActivity.checkUsername(nameFail));
        assertFalse(MainActivity.checkUsername(nameFail2));
    }

    @Test
    public void mainactivity_checkPasswords() {
        setup_test();

        String passClear = "SuperMetroid";
        String passClear2 = "12+Years";
        String passFail = "SHALLNOTPASS";
        String passFail2 = "WRONG";

        MainActivity.name = "SamusAran";
        assertTrue(MainActivity.checkPassword(passClear));

        MainActivity.name = "SamusAran";
        assertFalse(MainActivity.checkPassword(passFail));

        MainActivity.name = "AdvanceWars";
        assertTrue(MainActivity.checkPassword(passClear2));

        MainActivity.name = "AdvanceWars";
        assertFalse(MainActivity.checkPassword(passFail2));
    }
}