package adexrepo.springbasic.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import adexrepo.springbasic.data.Foo;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class BeanConfiguration {
    
    @Bean
    public Foo foo(){
        Foo foo = new Foo();
        log.info("create bean foo");
        return foo;
    }

}
