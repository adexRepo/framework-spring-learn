package adexrepo.springbasic.event;

import org.springframework.context.ApplicationEvent;

import adexrepo.springbasic.data.User;
import lombok.Getter;

public class LoginSuccessEvent extends ApplicationEvent {

    @Getter
    private final User user;

    public LoginSuccessEvent(User user) {
        // artinya disini saat login ada event yang isinya adalah User yang sukses login
        super(user);
        this.user= user;
    }
    
}
