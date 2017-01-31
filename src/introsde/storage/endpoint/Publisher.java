package introsde.storage.endpoint;

import java.io.IOException;
import java.net.InetAddress;
import java.net.URISyntaxException;

import javax.xml.ws.Endpoint;

import introsde.storage.ws.StorageImpl;

public class Publisher {
	
    public static void main(String[] args) throws IllegalArgumentException, IOException, URISyntaxException{
        String PROTOCOL = "http://";
        String HOSTNAME = InetAddress.getLocalHost().getHostAddress();
        if (HOSTNAME.equals("127.0.0.1"))
        {
            HOSTNAME = "localhost";
        }
        String PORT = "6904";
        String BASE_URL = "/storage";

        if (String.valueOf(System.getenv("PORT")) != "null"){
            PORT=String.valueOf(System.getenv("PORT"));
        }

        String endpointUrl = PROTOCOL+HOSTNAME+":"+PORT+BASE_URL;
        System.out.println("Starting Storage Service...");
        System.out.println("--> Published at = "+endpointUrl+"?wsdl");
        Endpoint.publish(endpointUrl, new StorageImpl());
        }

}
