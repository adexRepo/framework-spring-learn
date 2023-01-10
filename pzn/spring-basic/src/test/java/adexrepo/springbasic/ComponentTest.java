package adexrepo.springbasic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import adexrepo.springbasic.config.ComponentConfiguration;
import adexrepo.springbasic.repository.ProductRepository;
import adexrepo.springbasic.service.ProductService;

public class ComponentTest {
    
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testService(){
    
        ProductService productService1 = applicationContext.getBean(ProductService.class);
        ProductService productService2 = applicationContext.getBean("productService",ProductService.class);

        Assertions.assertEquals(productService1, productService2);

    }

    @Test
    void testConstructorDependencyInjection(){
        // hasil inject by constructort
        ProductService productService = applicationContext.getBean(ProductService.class); 

        // original dari ProductService
        ProductRepository productRepository = applicationContext.getBean(ProductRepository.class);

        Assertions.assertSame(productRepository, productService.getProductRepository());

    }

}
