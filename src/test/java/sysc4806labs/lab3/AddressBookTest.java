package sysc4806labs.lab3;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AddressBookTest {

    AddressBook addressBook;

    @Before
    public void setUp(){
        addressBook = new AddressBook();
    }


    @Test
    public void addBuddy() {
        BuddyInfo newBuddyInfo = new BuddyInfo("Ali","6476584382");
        addressBook.addBuddy(newBuddyInfo);
        assertTrue("AddressBook should have same buddy object", addressBook.buddyExistsByName("Ali"));
    }

    @Test
    public void addBuddyList() {
        BuddyInfo firstBuddy = new BuddyInfo("Ali","64755344242");
        BuddyInfo secondBuddy = new BuddyInfo("Raj","6475346545");
        BuddyInfo thirdBuddy = new BuddyInfo("Omar","4168563424");
        ArrayList<BuddyInfo> buddyInfoArrayList = new ArrayList<>();
        buddyInfoArrayList.add(firstBuddy);
        buddyInfoArrayList.add(secondBuddy);
        buddyInfoArrayList.add(thirdBuddy);
        addressBook.addBuddyList(buddyInfoArrayList);
        assertTrue("Address-book should have the same buddy list", addressBook.buddyListExists(buddyInfoArrayList));
    }

    @Test
    public void removeBuddy() {
        BuddyInfo firstBuddy = new BuddyInfo("Ali","64755344242");
        addressBook.addBuddy(firstBuddy);
        if(addressBook.buddyInfos.size() != 0){
            addressBook.removeBuddy(firstBuddy);
        }
        assertFalse("Address book should be empty now", addressBook.buddyExistsByName("Ali"));
    }

    @Test
    public void removeBuddyList() {
        BuddyInfo firstBuddy = new BuddyInfo("Ali","64755344242");
        BuddyInfo secondBuddy = new BuddyInfo("Raj","6475346545");
        BuddyInfo thirdBuddy = new BuddyInfo("Omar","4168563424");
        ArrayList<BuddyInfo> buddyInfoArrayList = new ArrayList<>();
        buddyInfoArrayList.add(firstBuddy);
        buddyInfoArrayList.add(secondBuddy);
        buddyInfoArrayList.add(thirdBuddy);
        addressBook.addBuddyList(buddyInfoArrayList);
        addressBook.removeBuddyList(buddyInfoArrayList);
        assertEquals("Address book should be empty",addressBook.buddyInfos.size(),0);
    }
}