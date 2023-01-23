package adexrepo.springbasic.application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import adexrepo.springbasic.data.Foo;

public class WithoutSpringBootTest {
    
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(FooApplication.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testFoo(){
        Foo foo = applicationContext.getBean(Foo.class);

        Assertions.assertNotNull(foo);
    }
    // Error : // tambahin Bar di parameter FooApplication.class pada pembuatan bean Foo
    // org.springframework.beans.factory.UnsatisfiedDependencyException:
    // Error creating bean with name 'foo' defined in adexrepo.springbasic.application.FooApplication:
    // Unsatisfied dependency expressed through method 'foo' parameter 0:
    // No qualifying bean of type 'adexrepo.springbasic.data.Bar' available:
    // expected at least 1 bean which qualifies as autowire candidate. Dependency annotations: {}

}
