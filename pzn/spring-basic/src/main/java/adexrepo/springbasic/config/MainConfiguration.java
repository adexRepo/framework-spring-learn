package adexrepo.springbasic.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import adexrepo.springbasic.config.configuration.BarConfiguration;
import adexrepo.springbasic.config.configuration.FooConfiguration;

@Configuration
@Import(value = {
    FooConfiguration.class,
    BarConfiguration.class
})
public class MainConfiguration {
    
}
