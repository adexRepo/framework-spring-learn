package adexrepo.springbasic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import adexrepo.springbasic.data.Car;
import adexrepo.springbasic.processor.IdGeneratorBeanPostProcessor;
import adexrepo.springbasic.processor.PrefixIdGeneratorBeanPostProcessor;

public class OrderedTest {
    
    @Configuration
    @Import({
        Car.class,
        IdGeneratorBeanPostProcessor.class,
        PrefixIdGeneratorBeanPostProcessor.class
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
    void testCar(){
        Car car = applicationContext.getBean(Car.class);

        Assertions.assertNotNull(car.getId());
        Assertions.assertTrue(car.getId().startsWith("ADX-"));

        // IdGeneratorBeanPostProcessor pertama >> default set 0
        // PrefixIdGeneratorBeanPostProcessor kedua >> set 1
    }

}
