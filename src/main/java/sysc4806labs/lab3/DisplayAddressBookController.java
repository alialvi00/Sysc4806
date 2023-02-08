package sysc4806labs.lab3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DisplayAddressBookController {

    private final AddressBookRepository addressBookRepository;

    @Autowired
    public DisplayAddressBookController(AddressBookRepository addressBookRepository){this.addressBookRepository=addressBookRepository;}


    @GetMapping("/displayAddressBook")
    public String renderShowAddressBook(@RequestParam("addressBookId")long addressBookId, Model model){
        AddressBook addressBook = addressBookRepository.findById(addressBookId);
        model.addAttribute("addressBook", addressBook);
        return "ShowAddressBook";
    }
}
