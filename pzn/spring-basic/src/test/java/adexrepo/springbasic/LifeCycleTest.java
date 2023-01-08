package adexrepo.springbasic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import adexrepo.springbasic.config.LifeCycleConfiguration;
import adexrepo.springbasic.data.Connection;
import adexrepo.springbasic.data.Server;

public class LifeCycleTest {
    
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
        // otomatis mematikan application context
        applicationContext.registerShutdownHook();
    }

    @Test
    void testConnection(){
        // defaultnya dimatikan secara paksa akhirnya di destroy tidak dipanggil
        Connection connection = applicationContext.getBean(Connection.class);
        Assertions.assertNotNull(connection);
    }

    @AfterEach
    void tearDown(){
        // manual mematikan application context
        // applicationContext.close();
    }

    @Test
    void testServer(){
        Server server = applicationContext.getBean(Server.class);
        Assertions.assertNotNull(server);
    }

}
