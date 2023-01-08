package adexrepo.springbasic.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import adexrepo.springbasic.data.Connection;
import adexrepo.springbasic.data.Server;

@Configuration
public class LifeCycleConfiguration {
    
    @Bean
    public Connection connection(){
        return new Connection();
    }

    // * @Bean(initMethod = "start", destroyMethod = "stop") // when using bean
    @Bean
    public Server server(){
        return new Server();
    }

}
