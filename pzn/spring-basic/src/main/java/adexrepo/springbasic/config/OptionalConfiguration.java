package adexrepo.springbasic.config;

import java.util.Optional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import adexrepo.springbasic.data.Bar;
import adexrepo.springbasic.data.Foo;
import adexrepo.springbasic.data.FooBar;

@Configuration
public class OptionalConfiguration {
    
    @Bean
    public Foo foo(){
        return new Foo();
    }

    @Bean
    public FooBar foobar(Optional<Foo> foo , Optional<Bar> bar){
        return new FooBar(foo.orElse(null),bar.orElse(null));
    }

}
