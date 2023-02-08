package sysc4806labs.lab3;

import org.junit.BeforeClass;

import static org.junit.Assert.*;

public class BuddyInfoTest {

    static BuddyInfo newBuddy;

    @BeforeClass
    public static void setUp(){
        newBuddy = new BuddyInfo("Ali","6476489714");
    }

    @org.junit.Test
    public void getBuddyName() {
        assertEquals("Ali",newBuddy.getBuddyName());
    }

    @org.junit.Test
    public void getPhoneNum() {
        assertEquals("6476489714",newBuddy.getPhoneNum());
    }
}