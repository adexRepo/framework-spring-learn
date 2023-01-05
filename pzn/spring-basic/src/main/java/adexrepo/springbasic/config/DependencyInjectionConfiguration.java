package adexrepo.springbasic.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import adexrepo.springbasic.data.Bar;
import adexrepo.springbasic.data.Foo;
import adexrepo.springbasic.data.FooBar;

@Configuration
public class DependencyInjectionConfiguration {
    
    @Bean
    public Foo foo(){
        return new Foo();
    }

    @Bean Bar bar(){
        return new Bar();
    }

    @Bean
    public FooBar foobar(Foo foo, Bar bar){
        // ini parameter Foo dan Bar akan otomatis di inject oleh spring
        return new FooBar(foo,bar);
    }

}
