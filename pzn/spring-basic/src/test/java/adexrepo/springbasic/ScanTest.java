package adexrepo.springbasic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import adexrepo.springbasic.config.ScanConfiguration;
import adexrepo.springbasic.data.Bar;
import adexrepo.springbasic.data.Foo;

public class ScanTest {
    
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void  setUp(){
        applicationContext = new AnnotationConfigApplicationContext(ScanConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testComponentScan(){
        Foo foo = applicationContext.getBean(Foo.class);
        Bar bar = applicationContext.getBean(Bar.class);

        Assertions.assertNotNull(bar);
        Assertions.assertNotNull(foo);
    }

}
