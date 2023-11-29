package tr.gov.gib.sf300unittest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import tr.gov.gib.sf300unittest.di.Araba;

@SpringBootApplication
public class Sf300UnitTestApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Sf300UnitTestApplication.class, args);
        Araba araba = context.getBean(Araba.class);
        araba.baslat();
    }

}
