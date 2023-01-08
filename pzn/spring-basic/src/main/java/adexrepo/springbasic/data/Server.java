package adexrepo.springbasic.data;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Server {
    
    // * when using :@PostConstruct and @Predestroy
    @PostConstruct
    public void start() {
      log.info("Start");  
    }
    
    @PreDestroy
    public void stop() {
        log.info("Stop");  
    }

    // * When using bean
    // public void start() {
    //   log.info("Start");  
    // }
    
    // public void stop() {
    //     log.info("Stop");  
    // }

}
