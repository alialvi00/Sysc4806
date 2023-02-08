package sysc4806labs.lab3;
import org.springframework.data.repository.CrudRepository;


public interface AddressBookRepository extends CrudRepository<AddressBook, Integer>{

    AddressBook findById(long Id);
}
