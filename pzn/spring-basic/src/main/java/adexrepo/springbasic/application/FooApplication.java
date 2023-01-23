package adexrepo.springbasic.application;

import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import adexrepo.springbasic.data.Foo;
import adexrepo.springbasic.listener.AppStartingListener;

@SpringBootApplication
public class FooApplication {
 
    //* dicomment karena pgn coba method main yg bawah
    // public static void main(String[] args) {
    //     ConfigurableApplicationContext applicationContext = SpringApplication.run(FooApplication.class, args);
        
    //     Foo foo = applicationContext.getBean(Foo.class);

    //     System.out.println(foo);
    // }

    // * dicomment karena mau coba plugin
    // public static void main(String[] args) {
    //     SpringApplication application = new SpringApplication(FooApplication.class);
    //     application.setBannerMode(Banner.Mode.OFF);
        
    //     // 33
    //     application.setListeners(List.of(
    //             new AppStartingListener()));

    //     ConfigurableApplicationContext ctx = application.run(args);

    //     Foo foo = ctx.getBean(Foo.class);

    //     System.out.println(foo);
    // }

    @Bean
    // public Foo foo(Bar bar){ // use this if want to see failure analyzer spring boot
    public Foo foo(){
        return new Foo();
    }
}
