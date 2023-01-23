package adexrepo.springbasic.client;

import lombok.Data;

@Data
public class PaymentGatewayClient {

    private String endPoint;
    private String publicKey;
    private String privateKey;

}
