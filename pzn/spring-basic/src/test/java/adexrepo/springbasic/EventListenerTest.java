package adexrepo.springbasic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import adexrepo.springbasic.listener.LoginAgainSuccessListener;
import adexrepo.springbasic.listener.LoginSuccessListener;
import adexrepo.springbasic.listener.UserListener;
import adexrepo.springbasic.service.UserService;

public class EventListenerTest {
    
    @Configuration
    @Import({
        UserService.class,
        LoginSuccessListener.class,
        LoginAgainSuccessListener.class,
        UserListener.class
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
    void testEvent(){
        UserService userSvc = applicationContext.getBean(UserService.class);

        userSvc.login("adek", "password");
        userSvc.login("adex", "password");
        userSvc.login("adec", "rahasia");
    }
}
