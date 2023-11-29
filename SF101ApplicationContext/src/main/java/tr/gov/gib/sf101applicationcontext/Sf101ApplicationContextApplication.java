package tr.gov.gib.sf101applicationcontext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import tr.gov.gib.sf101applicationcontext.service.MyService;
import tr.gov.gib.sf101applicationcontext.service.impl.MyServiceImpl;

@SpringBootApplication
public class Sf101ApplicationContextApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context= SpringApplication.run(Sf101ApplicationContextApplication.class,args);
        MyService myService= context.getBean(MyServiceImpl.class);
        myService.printMessage();
    }

}
