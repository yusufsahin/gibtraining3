package tr.gov.gib.sf300unittest;

import org.junit.jupiter.api.Test;
import tr.gov.gib.sf300unittest.di.Araba;
import tr.gov.gib.sf300unittest.di.Motor;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ArabaTest {
    @Test
    public void baslatTest()
    {
        Motor mockMotor= new Motor("Benzinli");
        Araba araba= new Araba(mockMotor);
        assertNotNull(araba);
    }
}
