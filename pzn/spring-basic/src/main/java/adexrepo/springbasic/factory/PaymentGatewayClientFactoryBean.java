package adexrepo.springbasic.factory;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import adexrepo.springbasic.client.PaymentGatewayClient;

@Component("paymentGatewayClient")
public class PaymentGatewayClientFactoryBean implements FactoryBean<PaymentGatewayClient>{
    // yang bisa dilakukan oleh Component bisa juga di lakukan di factory bean
    // yang akan jadi nama bean nya adalah si getObject() nya

    @Override
    @Nullable
    public PaymentGatewayClient getObject() throws Exception {
        PaymentGatewayClient client  = new PaymentGatewayClient();
        client.setEndPoint("https://payment.test");
        client.setPrivateKey("private");
        client.setPublicKey("public");
        return client;
    }

    @Override
    @Nullable
    public Class<?> getObjectType() {
        return PaymentGatewayClient.class;
    }
    
}
