package sysc4806labs.lab3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AccessingBuddyInfoDataApplication {

    private static final Logger log = LoggerFactory.getLogger(AccessingBuddyInfoDataApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(AccessingBuddyInfoDataApplication.class);
    }

    /**
    @Bean
    public CommandLineRunner demo(BuddyInfoRepository repository) {
        return (args) -> {
            // save a few customers
            repository.save(new BuddyInfo("Jack", "6476478392"));
            repository.save(new BuddyInfo("Chloe", "6472382493"));
            repository.save(new BuddyInfo("Kim", "6473231343"));
            repository.save(new BuddyInfo("David", "6474243212"));
            repository.save(new BuddyInfo("Michelle", "4162343400"));

            // fetch an individual customer by ID
            BuddyInfo buddyInfo = repository.findByBuddyInfoId(1);
            log.info("Buddy found with findById(1):");
            log.info("--------------------------------");
            log.info(buddyInfo.print());
            log.info("");

            // fetch customers by last name
            log.info("Buddy found with findByLastName('Bauer'):");
            log.info("--------------------------------------------");
            repository.findByBuddyName("Bauer").forEach(bauer -> {
                log.info(bauer.print());
            });
            // for (Customer bauer : repository.findByLastName("Bauer")) {
            //  log.info(bauer.toString());
            // }
            log.info("");
        };
    }
**/
}