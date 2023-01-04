package adexrepo.springbasic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import adexrepo.springbasic.config.HelloWorldConfiguration;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ApplicationContextTest {

    @Test
    void testApplicationContext(){

        ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        Assertions.assertNotNull(context);

        log.info("1 test passed");
    }
}
