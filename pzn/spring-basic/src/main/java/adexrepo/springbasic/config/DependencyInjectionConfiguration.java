package adexrepo.springbasic.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import adexrepo.springbasic.data.Bar;
import adexrepo.springbasic.data.Foo;
import adexrepo.springbasic.data.FooBar;

@Configuration
public class DependencyInjectionConfiguration {
    
    @Primary
    @Bean
    public Foo fooFirst(){
        return new Foo();
    }

    @Bean Foo fooSecond(){
        return new Foo();
    }

    @Bean Bar bar(){
        return new Bar();
    }

    @Bean
    public FooBar foobar(@Qualifier(value="fooSecond") Foo foo, Bar bar){
        // ini parameter Foo dan Bar akan otomatis di inject oleh spring
        return new FooBar(foo,bar);
    }

}
