package adexrepo.springbasic.config;

import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import adexrepo.springbasic.data.Bar;
import adexrepo.springbasic.data.Foo;
import adexrepo.springbasic.data.scope.DoubletonScope;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class ScopeConfiguration {
    
    @Bean
    @Scope("prototype")
    public Foo foo(){
        log.info("Create new Foo {}");
        return new Foo();
    }

    // Create new scope doubleton
    @Bean
    public CustomScopeConfigurer customScopeConfigurer(){
        CustomScopeConfigurer configurer = new CustomScopeConfigurer();
        configurer.addScope("doubleton", new DoubletonScope());
        return configurer;
    }

    @Bean
    @Scope("doubleton")
    public Bar bar(){
        log.info("Create new bar");
        return new Bar();
    }

}
