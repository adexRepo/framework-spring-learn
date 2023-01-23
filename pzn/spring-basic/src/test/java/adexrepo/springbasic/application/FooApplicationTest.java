package adexrepo.springbasic.application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import adexrepo.springbasic.data.Foo;

@SpringBootTest(classes = FooApplication.class)
public class FooApplicationTest {
    
    @Autowired Foo foo;

    @Test
    void testSpringBoot(){
        Assertions.assertNotNull(foo);
    }

    // Error Failure
    // Description:
    // Parameter 0 of method foo in adexrepo.springbasic.application.FooApplication required a bean of type 'adexrepo.springbasic.data.Bar' that could not be found.
    // 2

    // Action:
    // Consider defining a bean of type 'adexrepo.springbasic.data.Bar' in your configuration.

}
