package adexrepo.springbasic;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import adexrepo.springbasic.config.ScanConfiguration;
import adexrepo.springbasic.data.Foo;

public class BeanFactoryTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(ScanConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testBeanFactory(){
        // applicationContext.getBean(null)
        ObjectProvider<Foo> fooObjectProvider = applicationContext.getBeanProvider(Foo.class);
        List<Foo> fooList = fooObjectProvider.stream().collect(Collectors.toList());
        System.out.println(fooList);// result:
        // [
        //     adexrepo.springbasic.data.Foo@52045dbe,
        //     adexrepo.springbasic.data.Foo@674658f7,
        //     adexrepo.springbasic.data.Foo@5c8eee0f
        // ]

        Map<String,Foo> beansOfTypeFoo = applicationContext.getBeansOfType(Foo.class);
        System.out.println(beansOfTypeFoo); // result:
        // {
        //     foo = adexrepo.springbasic.data.Foo@52045dbe,
        //     foo2=adexrepo.springbasic.data.Foo@674658f7,
        //     foo3=adexrepo.springbasic.data.Foo@5c8eee0f
        // }


    }

}
