package io.swagger.client;

import io.swagger.client.api.ApiAuthApi;
import io.swagger.client.api.QueryApi;
import io.swagger.client.model.AccessToken;
import io.swagger.client.model.Query;
import java.util.*;
import org.junit.Test;

/**
 * Created by scott on 10/2/15.
 */

public class TestRunInlineQuery {
    @Test
    public void RunInlineQuery(){

        String client_id = "";
        String client_secret = "";
        String basePath = "";

        try {
            // instantiate ApiClient
            ApiClient apiClient = new ApiClient();

            // set api path
            apiClient.setBasePath(basePath);

            // instantiate AuthApi
            ApiAuthApi apiAuthApi = new ApiAuthApi(apiClient);

            // prepare token and secret for login
            AccessToken token = apiAuthApi.login(client_id, client_secret);

            Configuration config = new Configuration();

            // configure ApiClient
            config.setDefaultApiClient(apiClient);

            // add auth credentials to ApiClient
            config.getDefaultApiClient().addDefaultHeader("Authorization", "token " + token.getAccessToken());

            // prepare QueryApi
            QueryApi lookerQuery = new QueryApi();

            // create an empty query object
            Query query = new Query();

            // required parameters
            String model = "";
            String view = "";
            String fields_array[] = new String[]{"", ""};
            List fields = Arrays.asList(fields_array);

            // non-essential parameters
//            List<String> pivots = new ArrayList<String>();
//                pivots.add("");
            Map<String, String> filters = new HashMap<String, String>();
            filters.put("","");

            // add required fields to query
            query.setModel(model);
            query.setView(view);
            query.setFields(fields);
            query.setFilters(filters);
//            query.setPivots(pivots);

            // run look
            System.out.println(lookerQuery.runInlineQuery("json", query));

        } catch(Exception e) {
            System.out.println("Exception thrown  :" + e);
        }
    }

}