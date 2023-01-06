package adexrepo.springbasic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import adexrepo.springbasic.config.CyclicConfiguration;

public class CyclicTest {
    
    @Test
    void testCyclic(){

        // * Error creating bean with name 'cyclicA' defined in 
        // * adexrepo.springbasic.config.CyclicConfiguration:
        // * Unsatisfied dependency expressed through method 'cyclicA'
        // * parameter 0: Error creating bean with name 'cyclicB'
        // * defined in adexrepo.springbasic.config.CyclicConfiguration:
        // * Unsatisfied dependency expressed through method 'cyclicB'
        // * parameter 0: Error creating bean with name 'cyclicC'
        // * defined in adexrepo.springbasic.config.CyclicConfiguration:
        // * Unsatisfied dependency expressed through method 'cyclicC'
        // * parameter 0: Error creating bean with name 'cyclicA':
        // * Requested bean is currently in creation: Is there an
        // * unresolvable circular reference?

        Assertions.assertThrows(Throwable.class,()->{
            ApplicationContext context = new AnnotationConfigApplicationContext(CyclicConfiguration.class);
            Assertions.assertNotNull(context);
        });

    }

}
