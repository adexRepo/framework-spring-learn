package adexrepo.springbasic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import adexrepo.springbasic.service.AuthService;

public class AwareTest {
    
    @Configuration
    @Import({
        AuthService.class
    })
    public static class TestConfiguration{

    }

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testAware(){
        AuthService auth = applicationContext.getBean(AuthService.class);

        Assertions.assertNotNull(auth);
        Assertions.assertEquals("adexrepo.springbasic.service.AuthService",auth.getBeanName());
        Assertions.assertNotNull(auth.getApplicationContext());
        Assertions.assertSame(applicationContext, auth.getApplicationContext());

    }

}
