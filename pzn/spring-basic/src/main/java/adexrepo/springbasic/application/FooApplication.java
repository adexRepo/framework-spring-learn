package adexrepo.springbasic.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import adexrepo.springbasic.data.Foo;

@SpringBootApplication
public class FooApplication {
 
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(FooApplication.class, args);
        
        Foo foo = applicationContext.getBean(Foo.class);

        System.out.println(foo);
    }

    @Bean
    // public Foo foo(Bar bar){ // use this if want to see failure analyzer spring boot
    public Foo foo(){
        return new Foo();
    }
}
