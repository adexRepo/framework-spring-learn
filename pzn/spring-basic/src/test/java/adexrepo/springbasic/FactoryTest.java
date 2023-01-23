package adexrepo.springbasic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import adexrepo.springbasic.client.PaymentGatewayClient;
import adexrepo.springbasic.config.FactoryConfiguration;

public class FactoryTest {
 
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(FactoryConfiguration.class);
    }


    @Test
    void testFactory(){
        // ini dia namanya langsung PaymentGateWayClient bukan PaymentGateWayClientFactoryBean
        // karena yang direturn oleh getObject() adalah PaymentGateWayClient
        PaymentGatewayClient paymentGatewayClient = applicationContext.getBean(PaymentGatewayClient.class);

        Assertions.assertNotNull(paymentGatewayClient);
        Assertions.assertEquals("https://payment.test", paymentGatewayClient.getEndPoint());
        Assertions.assertEquals("private", paymentGatewayClient.getPrivateKey());
        Assertions.assertEquals("public", paymentGatewayClient.getPublicKey());
    }

}
