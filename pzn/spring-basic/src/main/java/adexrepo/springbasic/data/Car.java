package adexrepo.springbasic.data;

import org.springframework.stereotype.Component;

import adexrepo.springbasic.aware.IdAware;
import lombok.Getter;

@Component
public class Car implements IdAware{
    
    @Getter
    private String id;

    @Override
    public void setId(String id) {
        this.id = id;
    }
    

}
