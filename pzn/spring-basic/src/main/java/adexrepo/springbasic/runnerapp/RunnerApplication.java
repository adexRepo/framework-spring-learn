package adexrepo.springbasic.runnerapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RunnerApplication {

    public static void main(String[] args) {

        // vs code : launch.json 
        // need to add 
        //"args": ["--profiles=arg2", "--profiles=arg3"],
        SpringApplication.run(RunnerApplication.class, args);
    }

}
