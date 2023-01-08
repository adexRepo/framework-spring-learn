package adexrepo.springbasic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import adexrepo.springbasic.config.DependsOnConfiguration;
import adexrepo.springbasic.data.Foo;

public class DependsOnTest {
    
    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(DependsOnConfiguration.class);
    }

    @Test
    void testDependsOn(){
        // disini foo belum dibuat
        Assertions.assertNotNull(applicationContext);

        
        // disini foo diakses, saat diakses foo dibuat karena foo ada annotation @Lazy
        Foo foo = applicationContext.getBean(Foo.class);
        Assertions.assertNotNull(foo);

    }

}
