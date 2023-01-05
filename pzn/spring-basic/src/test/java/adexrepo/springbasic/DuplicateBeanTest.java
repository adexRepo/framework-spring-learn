package adexrepo.springbasic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import adexrepo.springbasic.config.DuplicateBeanConfiguration;
import adexrepo.springbasic.data.Foo;

public class DuplicateBeanTest {
    
    @Test
    void testDuplicateBean(){

        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateBeanConfiguration.class);

        // throw error karena ada 2 Foo1 dan foo2
        Assertions.assertThrows(NoUniqueBeanDefinitionException.class,()->{
            Foo foo = context.getBean(Foo.class);
            Assertions.assertNotNull(foo);
        });

        Assertions.assertNotNull(context);
    }

    @Test
    void getBean(){

        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateBeanConfiguration.class);

        Foo foo1 = context.getBean("foo1",Foo.class);
        Foo foo2 = context.getBean("foo2",Foo.class);

        Assertions.assertNotSame(foo1, foo2);

        ((AbstractApplicationContext) context).close();

    }


}
