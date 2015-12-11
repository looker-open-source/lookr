package com.looker.lookr;

import io.swagger.client.ApiClient;
import io.swagger.client.api.LookApi;
import io.swagger.client.api.ApiAuthApi;
import io.swagger.client.api.QueryApi;
import io.swagger.client.model.AccessToken;
import io.swagger.client.model.Query;
import io.swagger.client.Configuration;
import java.util.Arrays;
import java.util.List;
import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class Looker {

    public static void main(String[] args){
        ObjectMapper mapper = new ObjectMapper();
        try {
            Config ProjectConfig = mapper.readValue(new File("config.json"), Config.class);
            Looker.Setup(ProjectConfig.getClientId(), ProjectConfig.getClientSecret(), ProjectConfig.getApiEndpoint());
            Looker.RunInlineQuery("meta", "lead", new String[]{"lead.count"});
            Looker.RunLook(((long) 2039));
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    // method for starting up the api client
    public static void Setup(String clientId, String clientSecret, String basePath) {
        try {
            // instantiate ApiClient
            ApiClient apiClient = new ApiClient();

            // set api path
            apiClient.setBasePath(basePath);

            // instantiate AuthApi
            ApiAuthApi apiAuthApi = new ApiAuthApi(apiClient);

            // prepare token and secret for login
            AccessToken token = apiAuthApi.login(clientId, clientSecret);

            // configure ApiClient
            Configuration.setDefaultApiClient(apiClient);

            // add auth credentials to ApiClient
            Configuration.getDefaultApiClient().addDefaultHeader("Authorization", "token " + token.getAccessToken());

        }
        catch(Exception e) {
            System.out.println("Exception thrown  :" + e);
        }
    }

    // method for running inline queries
    public static void RunInlineQuery(String model, String view, String[] fields) {
        try {
            // create an empty query object
            QueryApi lookerQuery = new QueryApi();
            Query query = new Query();

            // add required fields to query
            if (model != null || view != null || fields != null) {
                query.setModel(model);
                query.setView(view);
                List field_list = Arrays.asList(fields);
                query.setFields(field_list);
//                query.setFilters(null);
//                query.setPivots(pivots);
            }

            // non-essential parameters
//            List<String> pivots = new ArrayList<String>();
//            pivots.add("");
//            Map<String, String> filters = new HashMap<String, String>();
//            List<String> sorts = new ArrayList<String>();
//            Long id = null;
//            String limit = null;
//            String columnLimit = null;
//            Boolean total = null;
//            String rowTotal = null;
//            Double runtime = null;
//            String visibleUiSections = null;
//            String slug = null;
//            String clientId = null;
//            String shareUrl = null;
//            String expandedShareUrl = null;
//            String queryTimezone = null;

//            private Map<String, String> visConfig = new HashMap<String, String>();
//            private Map<String, String> filterConfig = new HashMap<String, String>();
//            private List<String> dynamicFields = new ArrayList<String>();

            // run look
            System.out.println(lookerQuery.runInlineQuery("json", query));

        }
        catch (Exception e) {
            System.out.println("Exception thrown  :" + e);
        }
    }

    public static void RunLook(Long lookId){

        try {
            // prepare LookApi
            LookApi look = new LookApi();

            // run look
            System.out.println(look.runLook(lookId, "json"));

        } catch(Exception e) {
            System.out.println("Exception thrown  :" + e);
        }
    }
}