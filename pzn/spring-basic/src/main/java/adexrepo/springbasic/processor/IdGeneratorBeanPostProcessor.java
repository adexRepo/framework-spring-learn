package adexrepo.springbasic.processor;

import java.util.UUID;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import adexrepo.springbasic.aware.IdAware;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class IdGeneratorBeanPostProcessor implements BeanPostProcessor {
    
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException{
        log.info("Id Generator Processor for Bean {}",beanName);
        if(bean instanceof IdAware){
            log.info("Set Id Generator for Bean {}",beanName);
            // cara baca: kalo bean yang selesai init implement IdAware
            // maka set Id pakai UUID
            IdAware idAware = (IdAware) bean;
            idAware.setId(UUID.randomUUID().toString());
        }

        return bean;
    }

}
