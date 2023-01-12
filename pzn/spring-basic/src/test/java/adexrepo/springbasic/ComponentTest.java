package adexrepo.springbasic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import adexrepo.springbasic.config.ComponentConfiguration;
import adexrepo.springbasic.data.MultiFoo;
import adexrepo.springbasic.repository.CategoryRepository;
import adexrepo.springbasic.repository.CustomerRepository;
import adexrepo.springbasic.repository.ProductRepository;
import adexrepo.springbasic.service.CategoryService;
import adexrepo.springbasic.service.CustomerService;
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

    @Test
    void testSetterDependencyInjection(){
        CategoryService categoryService = applicationContext.getBean(CategoryService.class);
        CategoryRepository categoryRepository = applicationContext.getBean(CategoryRepository.class);

        Assertions.assertSame(categoryService.getCategoryRepository(), categoryRepository);
    }
    
    @Test
    void testFieldDependencyInjection(){
        CustomerService customerService = applicationContext.getBean(CustomerService.class);
        CustomerRepository customerRepository = applicationContext.getBean("normalCustomerRepository",CustomerRepository.class);
        
        Assertions.assertSame(customerService.getNormalCustomerRepository(), customerRepository);
    }

    @Test
    void testQualifierAnnotation(){
        CustomerService customerService = applicationContext.getBean(CustomerService.class);
        CustomerRepository normalCustomerRepository = applicationContext.getBean("normalCustomerRepository",CustomerRepository.class);
        CustomerRepository premiumCustomerRepository = applicationContext.getBean("premiumCustomerRepository",CustomerRepository.class);
        
        Assertions.assertSame(customerService.getNormalCustomerRepository(), normalCustomerRepository);
        Assertions.assertSame(customerService.getPremiumCustomerRepository(), premiumCustomerRepository);
    }

    @Test
    void testObjectProvider(){
        MultiFoo multiFoo = applicationContext.getBean(MultiFoo.class);

        Assertions.assertEquals(3, multiFoo.getFoos().size());

    }

}
