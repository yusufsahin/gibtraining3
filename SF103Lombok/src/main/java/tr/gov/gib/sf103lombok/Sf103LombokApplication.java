package tr.gov.gib.sf103lombok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tr.gov.gib.sf103lombok.dao.model.Person;

@SpringBootApplication
public class Sf103LombokApplication {

    public static void main(String[] args) {
        Person person= new Person("345678990","John","Doe");

        System.out.println(person.toString());

        SpringApplication.run(Sf103LombokApplication.class, args);
    }

}
