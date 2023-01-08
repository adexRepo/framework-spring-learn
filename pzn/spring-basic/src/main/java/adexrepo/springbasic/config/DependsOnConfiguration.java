package adexrepo.springbasic.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;

import adexrepo.springbasic.data.Bar;
import adexrepo.springbasic.data.Foo;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
public class DependsOnConfiguration {
    
    @Lazy
    @Bean
    @DependsOn({"bar"}) 
    // artinya foo akan dibuat setelah bar selesai dibuat
    public Foo foo(){
        log.info("Create Foo Bean");
        return new Foo();
    }

    @Bean
    public Bar bar(){
        log.info("Create Bar Bean");
        return new Bar();
    }

}
