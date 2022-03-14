package api;

import Framework.ConfigManager;
import Loggers.ILogger;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.FileNotFoundException;
import java.io.IOException;

public class UniRestClient implements ILogger {

    static {
        try {
            ConfigManager.getInstance();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        OkHttpClient okHttpClient = new OkHttpClient().newBuilder().build();
      //  MediaType mediaType = MediaType.parse(ContentType.APPLICATION_JSON.getValue());
       // RequestBody requestBody = RequestBody.create(mediaType,"");
        Request request = new Request.Builder().url("https://api.publicapis.org/random?title=cat")
                .method("GET", null).addHeader(Headers.APPLICATION_JSON.getKey(),
                Headers.APPLICATION_JSON.getValue()).build();
        Response response = okHttpClient.newCall(request).execute();
        System.out.println(response.body().string());
    }
}
