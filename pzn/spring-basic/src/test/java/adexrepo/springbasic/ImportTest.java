package adexrepo.springbasic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import adexrepo.springbasic.config.MainConfiguration;
import adexrepo.springbasic.data.Bar;
import adexrepo.springbasic.data.Foo;

public class ImportTest {
    
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(MainConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testImport(){
        Foo beanFoo = applicationContext.getBean(Foo.class);
        Bar beanBar = applicationContext.getBean(Bar.class);

        Assertions.assertNotNull(beanFoo);
        Assertions.assertNotNull(beanBar);

    }

}
