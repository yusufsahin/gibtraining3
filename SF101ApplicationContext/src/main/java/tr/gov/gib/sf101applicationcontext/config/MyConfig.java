package tr.gov.gib.sf101applicationcontext.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tr.gov.gib.sf101applicationcontext.service.impl.MyServiceImpl;

@Configuration
public class MyConfig {
    @Bean
    public MyServiceImpl myServiceImpl()
    {
        return  new MyServiceImpl();
    }
}
