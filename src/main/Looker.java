import io.swagger.client.model.AccessToken;

public class Looker {

    public static void main(String[]args){

        String client_id = "YQrRfCHQwQfz9fcChS28";
        String client_secret = "RgRXKd8QrzYvm8H7ckh8ZfvG";
        String basePath = "https://meta.looker.com:19999/api/3.0";

        try {
            // instantiate ApiClient
            ApiClient apiClient = new ApiClient();

            // instantiate AuthApi
            ApiAuthApi apiAuthApi = new ApiAuthApi(apiClient);

            // prepare token and secret for login
            AccessToken token = apiAuthApi.login(client_id, client_secret);

            // configure ApiClient
            Configuration.setDefaultApiClient(apiClient);

            // add auth credentials to ApiClient
            Configuration.getDefaultApiClient().addDefaultHeader("Authorization", "token " + token.getAccessToken());

            // prepare LookApi
            LookApi look = new LookApi();

            // run look
            System.out.println(look.runLook((long) 1298, "unified"));

        } catch(Exception e) {
            System.out.println("Exception thrown  :" + e);
        }
    }

}