package adexrepo.springbasic.data.scope;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;
import org.springframework.lang.Nullable;

public class DoubletonScope implements Scope {
    // * NOTE :
    // * tidak harus semuanya di gunakan
    // * yang penting get dan remove

    private List<Object> objects = new ArrayList<>(2);
    private Long counter = -1L;

    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        counter++;
        if(objects.size() == 2){
            int idx = (int)(counter % 2);
            return objects.get(idx);
        }else{
            Object object = objectFactory.getObject();
            objects.add(object);
            return object;
        }
    }

    @Override
    @Nullable
    public Object remove(String name) {
        
        if(!objects.isEmpty() ){
            return objects.remove(0);
        }

        return null;
    }

    @Override
    public void registerDestructionCallback(String name, Runnable callback) {
        
        
    }

    @Override
    @Nullable
    public Object resolveContextualObject(String key) {
        
        return null;
    }

    @Override
    @Nullable
    public String getConversationId() {
        
        return null;
    }
    
}
