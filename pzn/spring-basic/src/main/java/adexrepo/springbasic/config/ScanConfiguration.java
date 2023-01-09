package adexrepo.springbasic.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
    "adexrepo.springbasic.config.configuration"
})
public class ScanConfiguration {
    
}
