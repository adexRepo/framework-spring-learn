package adexrepo.springbasic.config.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import adexrepo.springbasic.repository.CustomerRepository;

@Configuration
public class CustomerConfiguration {
    
    @Primary
    @Bean
    @Qualifier("normalCustomerRepository")
    public CustomerRepository normalCustomerRepository(){
        return new CustomerRepository();
    }
    
    @Bean
    @Qualifier("premiumCustomerRepository")
    public CustomerRepository premiumCustomerRepository(){
        return new CustomerRepository();
    }

}
