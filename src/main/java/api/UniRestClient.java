package api;

import Framework.ConfigManager;
import Loggers.ILogger;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class UniRestClient implements ILogger {

    static {
        try {
            ConfigManager.getInstance();
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException, JAXBException {
        OkHttpClient okHttpClient = new OkHttpClient().newBuilder().build();
      //  MediaType mediaType = MediaType.parse(ContentType.APPLICATION_JSON.getValue());
       // RequestBody requestBody = RequestBody.create(mediaType,"");
        Request request = new Request.Builder().url("https://api.publicapis.org/random?title=cat")
                .method("GET", null).addHeader(Headers.APPLICATION_JSON.getKey(),
                Headers.APPLICATION_JSON.getValue()).build();
        Response response = okHttpClient.newCall(request).execute();
        System.out.println(response.body().string());

        ConfigXml configXml = new ConfigXml();
        configXml.setBaseuri("google.com");
        configXml.setProtocol("http");
        configXml.setServiceName("public");

        JAXBContext context = JAXBContext.newInstance(ConfigXml.class);
        Marshaller mar= context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        mar.marshal(configXml, new File("./book.xml"));
    }
}
