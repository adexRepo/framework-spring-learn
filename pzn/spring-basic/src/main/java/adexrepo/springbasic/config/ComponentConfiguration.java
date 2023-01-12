package adexrepo.springbasic.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import adexrepo.springbasic.data.MultiFoo;

@Configuration
@ComponentScan(basePackages = {
    "adexrepo.springbasic.service", // src\main\java\adexrepo\springbasic\repository\ProductRepository.java
    "adexrepo.springbasic.repository", // src\main\java\adexrepo\springbasic\service\ProductService.java
    "adexrepo.springbasic.config.configuration" // src\main\java\adexrepo\springbasic\service\ProductService.java
})
@Import(MultiFoo.class)
public class ComponentConfiguration {
    
}
