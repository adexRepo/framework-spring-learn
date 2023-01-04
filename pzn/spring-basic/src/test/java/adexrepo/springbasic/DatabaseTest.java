package adexrepo.springbasic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import adexrepo.springbasic.data.Database;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DatabaseTest {
    
    @Test
    void testSingleton(){
        
        var database1 = Database.getInstance();
        var database2 = Database.getInstance();

        Assertions.assertSame(database1,database2);

        log.info("1 test passed");
    }

}
