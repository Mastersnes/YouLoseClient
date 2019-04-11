package client;

import abstrait.AbstractClient;
import enums.SaveType;
import request.GetSaveRequest;
import request.KongregateRequest;
import request.SaveRequest;
import response.GetSavesResponse;

import java.util.Map;

/**
 * Client de base de YouLose
 */
public class YouLoseClient extends AbstractClient {
    public YouLoseClient(String baseUrl) {
        init(baseUrl);
    }
    public YouLoseClient() {
        init("http://bebelws.fr.nf/youlose");
    }

    public Map<SaveType, String> getSaves(final String username) {
        final KongregateRequest request = new KongregateRequest();
        request.setUsername(username);
        request.setSecretPass(getSecret(username));
        final GetSavesResponse response = post("/getSaves", request, GetSavesResponse.class);
        return response.getSave();
    }
    public String getSave(final String username, final SaveType type) {
        final GetSaveRequest request = new GetSaveRequest();
        request.setUsername(username);
        request.setType(type);
        request.setSecretPass(getSecret(username));
        return post("/getSave", request, String.class);
    }

    public void save(final String username, final SaveType type, final String data) {
        final SaveRequest request = new SaveRequest();
        request.setUsername(username);
        request.setType(type);
        request.setData(data);
        request.setSecretPass(getSecret(username));
        post("/save", request, String.class);
    }

    public String getSecret(final String username) {
        return "YouLose1145"+username;
    }
}
