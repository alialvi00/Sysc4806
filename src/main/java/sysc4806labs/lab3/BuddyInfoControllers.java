package sysc4806labs.lab3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuddyInfoControllers {

    private final AddressBookRepository addressBookRepository;
    private final BuddyInfoRepository buddyInfoRepository;

    @Autowired
    public BuddyInfoControllers(BuddyInfoRepository buddyInfoRepository, AddressBookRepository addressBookRepository){
        this.buddyInfoRepository=buddyInfoRepository;
        this.addressBookRepository=addressBookRepository;
    }

    @RequestMapping("/addBuddy")
    public BuddyInfo addBuddy(@RequestParam("buddyName")String buddyName, @RequestParam("phoneNum")String phoneNum, @RequestParam(value = "addressBookId")long addressBookId){
        AddressBook addressBook = addressBookRepository.findById(addressBookId);
        BuddyInfo buddyInfo = new BuddyInfo(buddyName,phoneNum);
        addressBook.addBuddy(buddyInfo);
        buddyInfoRepository.save(buddyInfo);
        addressBookRepository.save(addressBook);
        return buddyInfo;
    }

    @RequestMapping("/removeBuddy")
    public BuddyInfo removeBuddy(@RequestParam(value = "addressBookId")long addressBookId, @RequestParam(value = "buddyId")long buddyId){

        AddressBook addressBook = addressBookRepository.findById(addressBookId);
        BuddyInfo buddyInfo = addressBook.findBuddyById(buddyId);
        addressBook.removeBuddy(buddyInfo);
        addressBookRepository.save(addressBook);
        buddyInfoRepository.delete(buddyInfo);
        return buddyInfo;
    }
}
