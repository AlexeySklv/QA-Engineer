import javax.print.attribute.standard.RequestingUserName;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class Main {
    public static void main (String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient()
                .newBuilder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(10, TimeUnit.SECONDS)
                .followRedirects(true)
                .retryOnConnectionFaulure(true)
                .build();

        Request request = new Request.Builder()
                .url("http://dataservice.accuweather.com")
                .build();
        Response response = client.newCall(request).execute();
        String body = response.body().string();

        System.out.println(response.code());
        System.out.println(response.headers());
        System.out.println(response.isRedirect());
        System.out.println(response.isSccessful());
        System.out.println(response.protocol());
        System.out.println(response.receivedResponseAtMillis());
    }
}
