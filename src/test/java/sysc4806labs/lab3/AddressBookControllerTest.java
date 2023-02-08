package sysc4806labs.lab3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class AddressBookControllerTest {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void createAddressBook() throws Exception{
        this.mockMvc.perform(put("/createAddressBook")).andDo(print()).andExpect(status().isOk()).andExpect(content().string(containsString("\"addressBook_id\"")));
    }

    @Test
    public void getAddressBook() throws Exception{
        this.mockMvc.perform(put("/createAddressBook")).andDo(print()).andExpect(status().isOk()).andExpect(content().string(containsString("\"addressBook_id\"")));

        this.mockMvc.perform(get("/getAddressBook?id=1")).andDo(print()).andExpect(status().isOk()).andExpect(content().string(containsString("\"addressBook_id\"")));
    }

}
