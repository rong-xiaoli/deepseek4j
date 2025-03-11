package top.rongxiaoli.deepseek4j;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import top.rongxiaoli.deepseek4j.consts.deepseek.DeepseekApiProvider;

import java.io.IOException;

public class DeepseekClient {
    private final String API_KEY;
    private final OkHttpClient httpClient;

    /**
     * Deepseek client for <a href="https://deepseek.com">Deepseek Platform</a>.
     * @param apiKey Deepseek API key. You can apply for one <a href="https://platform.deepseek.com/api_keys">here</a>.
     * @throws IOException Throws IOException if connection breaks.
     */
    public DeepseekClient(String apiKey) throws IOException {
        API_KEY = apiKey;
        httpClient = new OkHttpClient();
        Request balanceChecker = new Request.Builder()
                .url(DeepseekApiProvider.BASE_URL + DeepseekApiProvider.BALANCE)
                .addHeader("Authorization", "Bearer " + apiKey)
                .build();
        try (Response apiResponse = httpClient.newCall(balanceChecker).execute()) {
            System.out.println(apiResponse.body().string());

        }
    }
    public void checkConnection() {
        Request request = new Request.Builder()
                .url(DeepseekApiProvider.BASE_URL)
                .build();

    }
}