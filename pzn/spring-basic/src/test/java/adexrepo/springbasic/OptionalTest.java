package adexrepo.springbasic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import adexrepo.springbasic.config.OptionalConfiguration;
import adexrepo.springbasic.data.Foo;
import adexrepo.springbasic.data.FooBar;

public class OptionalTest {
    
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(OptionalConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testOptional(){
        Foo foo = applicationContext.getBean(Foo.class);
        FooBar foobar = applicationContext.getBean(FooBar.class);

        Assertions.assertNull(foobar.getBar());
        Assertions.assertSame(foo, foobar.getFoo());

    }

}
