package adexrepo.springbasic.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
    "adexrepo.springbasic.service", // src\main\java\adexrepo\springbasic\repository\ProductRepository.java
    "adexrepo.springbasic.repository", // src\main\java\adexrepo\springbasic\service\ProductService.java
    "adexrepo.springbasic.config.configuration" // src\main\java\adexrepo\springbasic\service\ProductService.java
})
public class ComponentConfiguration {
    
}
