package adexrepo.springbasic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import adexrepo.springbasic.config.PrimaryConfiguration;
import adexrepo.springbasic.data.Foo;

public class PrimaryBeanTest {
    
    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(PrimaryConfiguration.class);
    }

    @Test
    void testGetPrimaryBean(){
        
        Foo foo = applicationContext.getBean(Foo.class); // default nya adalah foo1 nama bean nya
        Foo foo1 = applicationContext.getBean("foo1",Foo.class);
        Foo foo2 = applicationContext.getBean("foo2",Foo.class);

        Assertions.assertSame(foo,foo1);
        Assertions.assertNotSame(foo,foo2);
        Assertions.assertNotSame(foo1,foo2);

    }

}
