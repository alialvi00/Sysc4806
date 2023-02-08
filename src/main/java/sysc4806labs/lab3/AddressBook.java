package sysc4806labs.lab3;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
public class AddressBook {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long addressBook_id;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    public List<BuddyInfo> buddyInfos;

    public AddressBook(){
        buddyInfos = new ArrayList<>();
    }

    public void setId(int addressBook_id){this.addressBook_id=addressBook_id;}
    public long getId(){return addressBook_id;}

    public boolean addBuddy(BuddyInfo newBuddy){
        return buddyInfos.add(newBuddy);
    }

    public boolean addBuddyList(List<BuddyInfo> buddyInfos){
        return this.buddyInfos.addAll(buddyInfos);
    }

    public boolean removeBuddy(BuddyInfo removedBuddy){
        return buddyInfos.remove(removedBuddy);
    }

    public boolean removeBuddyList(List<BuddyInfo> removedBuddyInfos){
        return buddyInfos.removeAll(removedBuddyInfos);
    }

    public BuddyInfo findBuddyById(long id){
        for(BuddyInfo eachBuddy : buddyInfos){
            if(eachBuddy.buddyInfoId==id)
                return eachBuddy;
        }
        return null;
    }

    public boolean buddyExistsByName(String buddyName){
        for(BuddyInfo eachBuddy : buddyInfos){
            return eachBuddy.getBuddyName().equals(buddyName);
        }
        return false;
    }

    public List<BuddyInfo> getBuddyInfos(){
        return this.buddyInfos;
    }

    public boolean buddyListExists(List<BuddyInfo> buddyInfos){
        boolean equalList = false;
        int counter = 0;

        for(BuddyInfo eachBuddy : buddyInfos){
            if(this.buddyInfos.get(counter) == eachBuddy){
                equalList = true;
                counter ++;
            }
            else{
                equalList = false;
                break;
            }
        }
        return equalList;
    }

    public void print(){
        System.out.println("Below is the list of each buddy in the address book: \n");
        int counter = 0;

        for(BuddyInfo buddy : buddyInfos){
            System.out.print("Buddy " + counter + ": ");
            counter++;
            buddy.print();
        }
    }
}
