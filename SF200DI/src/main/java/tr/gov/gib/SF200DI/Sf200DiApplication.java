package tr.gov.gib.SF200DI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import tr.gov.gib.SF200DI.di.Araba;

@SpringBootApplication
public class Sf200DiApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context= SpringApplication.run(Sf200DiApplication.class, args);

		Araba araba= context.getBean(Araba.class);
		araba.baslat();
	}

}
