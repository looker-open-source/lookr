package io.swagger.client;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by scott on 9/8/15.
 */

public class ApiClientTest {
    @Test
    public void testSomething(){
//        System.out.println("now we're talking.");
        ApiClient apiClient = new ApiClient();
        apiClient.getBasePath();
    }
}