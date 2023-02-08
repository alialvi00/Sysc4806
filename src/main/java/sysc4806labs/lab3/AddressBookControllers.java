package sysc4806labs.lab3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressBookControllers {

    private final AddressBookRepository addressBookRepository;

    @Autowired
    public AddressBookControllers(AddressBookRepository addressBookRepository){this.addressBookRepository=addressBookRepository;}

    @RequestMapping("/createAddressBook")
    public AddressBook createAddressBook(){
        AddressBook addressBook = new AddressBook();
        addressBookRepository.save(addressBook);
        return addressBook;
    }

    @RequestMapping("/getAddressBook")
    public AddressBook getAddressBook(@RequestParam("id") long id){
        return addressBookRepository.findById(id);
    }
}

