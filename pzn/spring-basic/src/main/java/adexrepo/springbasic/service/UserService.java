package adexrepo.springbasic.service;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

import adexrepo.springbasic.data.User;
import adexrepo.springbasic.event.LoginSuccessEvent;

@Component
public class UserService implements ApplicationEventPublisherAware{
    
    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;        
    }

    public boolean login(String username,String password){

        if(isLoginSuccess(username,password)){

            applicationEventPublisher.publishEvent(new LoginSuccessEvent(new User(username)));
            return true;
        }else{
            
            return false;
        }
        
    }

    public boolean isLoginSuccess(String username, String password){
        return username.equals("adek") && password.equals("password");
    }

}
