package sysc4806labs.lab3;


import jakarta.persistence.*;

@Entity
public class BuddyInfo {

    private String buddyName;
    private String phoneNum;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long buddyInfoId;

    public BuddyInfo(String buddyName, String phoneNum){
        this.buddyName=buddyName;
        this.phoneNum=phoneNum;
    }

    public BuddyInfo() {
    }

    public void setId(int buddyInfo_id){this.buddyInfoId =buddyInfo_id;}
    public BuddyInfo checkID(int buddyInfo_id){
        if (buddyInfo_id == this.buddyInfoId)
            return this;
        return null;
    }

    public long getBuddyInfoId(){return buddyInfoId;}

    public String getBuddyName(){return this.buddyName;}
    public void setBuddyName(String buddyName){this.buddyName=buddyName;}

    public String getPhoneNum(){return this.phoneNum;}
    public void setPhoneNum(String phoneNum){this.phoneNum=phoneNum;}

    public BuddyInfo getBuddyByName(String buddyName){
        if (buddyName.equals(this.buddyName))
            return this;
        return null;
    }


    public String print(){
        return "Buddy Name: " + this.buddyName + " | Buddy phone number: " + this.phoneNum + '\n';
    }

}
