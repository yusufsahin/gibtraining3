package tr.gov.gib.sf100hellospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sf100HelloSpringBootApplication {

    public static void main(String[] args) {
        System.out.println("Hello Spring Boot");
        SpringApplication.run(Sf100HelloSpringBootApplication.class, args);
    }

}
