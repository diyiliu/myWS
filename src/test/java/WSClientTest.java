import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.junit.Test;

/**
 * Description: WSClientTest
 * Author: DIYILIU
 * Update: 2016-06-03 17:14
 */
public class WSClientTest {

    @Test
    public void test(){

        JaxWsDynamicClientFactory clientFactory = JaxWsDynamicClientFactory.newInstance();
        Client client = clientFactory.createClient("http://127.0.0.1:8989/WS/MyWebservice?wsdl");

        try {
            Object[] result = client.invoke("sayHello", "tom");
            System.out.println(result[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
