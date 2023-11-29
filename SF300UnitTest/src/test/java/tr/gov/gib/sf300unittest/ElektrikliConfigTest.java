package tr.gov.gib.sf300unittest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import tr.gov.gib.sf300unittest.di.Motor;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("elektrikli")
public class ElektrikliConfigTest {

    @Autowired
    private Motor motor;

    @Test
    public void elektrikliMotorTest(){
        assertEquals("Elektrikli",motor.tipGetir());
    }
}
