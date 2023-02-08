package sysc4806labs.lab3;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface BuddyInfoRepository extends CrudRepository<BuddyInfo, Integer> {

    List<BuddyInfo> findByBuddyName(String buddyName);

    BuddyInfo findByBuddyInfoId(int buddyInfoId);
}
