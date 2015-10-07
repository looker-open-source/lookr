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
        String basePath = "https://metanew.looker.com:19999/api/3.0";

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
            String model = "meta";
            String view = "lead";
            String fields_array[] = new String[]{"lead.grouping", "lead.created_month", "lead.count"};
            List fields = Arrays.asList(fields_array);

            // non-essential parameters
            List<String> pivots = new ArrayList<String>();
                pivots.add("lead.grouping");
            Map<String, String> filters = new HashMap<String, String>();
            filters.put("lead.created_date","90 days");
            java.util
//            List<String> sorts = new ArrayList<String>();
            Long id = null;
            String limit = null;
            String columnLimit = null;
            Boolean total = null;
            String rowTotal = null;
            Double runtime = null;
            String visibleUiSections = null;
            String slug = null;
            String clientId = null;
            String shareUrl = null;
            String expandedShareUrl = null;
            String queryTimezone = null;

//            private Map<String, String> visConfig = new HashMap<String, String>();
//            private Map<String, String> filterConfig = new HashMap<String, String>();
//            private List<String> dynamicFields = new ArrayList<String>();


            // add required fields to query
            query.setModel(model);
            query.setView(view);
            query.setFields(fields);
            query.setFilters(filters);
            query.setPivots(pivots);

            // run look
            System.out.println(lookerQuery.runInlineQuery("json", query));

        } catch(Exception e) {
            System.out.println("Exception thrown  :" + e);
        }
    }

}