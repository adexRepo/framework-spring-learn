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

public class BeanPostProcessorTest {
    
    @Configuration
    @Import({
        Car.class,
        IdGeneratorBeanPostProcessor.class
    })
    public static class TestConfiguration{
    }

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(TestConfiguration.class);
        applicationContext.registerShutdownHook();
        // Id Generator Processor for Bean adexrepo.springbasic.data.Car
        // Set Id Generator for Bean adexrepo.springbasic.data.Car
    }

    @Test
    void testCar(){
        Car car = applicationContext.getBean(Car.class);
        System.out.println(car); 
        //adexrepo.springbasic.data.Car@7ec3394b

        Assertions.assertNotNull(car);
    }

}
