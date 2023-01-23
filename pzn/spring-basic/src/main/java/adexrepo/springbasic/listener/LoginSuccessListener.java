package adexrepo.springbasic.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import adexrepo.springbasic.event.LoginSuccessEvent;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class LoginSuccessListener implements ApplicationListener<LoginSuccessEvent> {@Override
    public void onApplicationEvent(LoginSuccessEvent event) {
        // saat ada event
        log.info("Success login for user {}",event.getUser());        
    }
    
}
