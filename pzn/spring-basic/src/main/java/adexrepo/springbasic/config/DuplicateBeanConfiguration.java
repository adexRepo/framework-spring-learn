package adexrepo.springbasic.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import adexrepo.springbasic.data.Foo;

@Configuration
public class DuplicateBeanConfiguration {
 
    @Bean
    public Foo foo1(){
        return new Foo();
        
    }    
    
    @Bean
    public Foo foo2(){
        return new Foo();
    }    

}
