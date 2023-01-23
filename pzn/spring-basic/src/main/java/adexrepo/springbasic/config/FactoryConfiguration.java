package adexrepo.springbasic.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import adexrepo.springbasic.factory.PaymentGatewayClientFactoryBean;

@Configuration
@Import({
    PaymentGatewayClientFactoryBean.class
})
public class FactoryConfiguration {
}

