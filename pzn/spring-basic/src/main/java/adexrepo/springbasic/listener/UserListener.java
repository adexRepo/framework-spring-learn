package adexrepo.springbasic.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import adexrepo.springbasic.event.LoginSuccessEvent;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class UserListener {
    
    @EventListener(classes = LoginSuccessEvent.class)
    public void onLoginSuccessEvent(LoginSuccessEvent LoginSuccessEvent){
        log.info("Success login for user by @EventListener {}",LoginSuccessEvent.getUser());        
    }

    // * UserListener bisa di dijadiin tempat untuk semua listener yang berkaitan dengan user

    // @EventListener(classes = LoginSuccessEvent.class)
    // public void onLoginSuccessEvent(LoginSuccessEvent LoginSuccessEvent){
    //     log.info("Success login for user by @EventListener {}",LoginSuccessEvent.getUser());        
    // }
    
    // @EventListener(classes = LoginSuccessEvent.class)
    // public void onLoginSuccessEvent(LoginSuccessEvent LoginSuccessEvent){
    //     log.info("Success login for user by @EventListener {}",LoginSuccessEvent.getUser());        
    // }



}
