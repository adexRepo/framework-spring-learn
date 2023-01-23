package adexrepo.springbasic.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import adexrepo.springbasic.aware.IdAware;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class PrefixIdGeneratorBeanPostProcessor implements BeanPostProcessor,Ordered {
    
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException{
        log.info("Prefix Id Generator Processor for Bean {}",beanName);
        if(bean instanceof IdAware){
            log.info("Set Prefix Id Generator for Bean {}",beanName);
            // cara baca: kalo bean yang selesai init implement IdAware
            // maka set Id pakai UUID
            IdAware idAware = (IdAware) bean;
            idAware.setId("ADX-"+idAware.getId());
        }

        return bean;
    }

    @Override
    public int getOrder() {
        return 1; // first lower
    }

}
