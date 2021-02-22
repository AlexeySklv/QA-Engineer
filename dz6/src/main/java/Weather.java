import java.io.IOException;

public class Weather {
    private static final String HOST = "dataservice.accuweather.com";
    private static final String TOWN_KEY = "294021";
    private static final String API_KEY = "60tzjyZNHCCWGonXsnezC8y7G7mumKPe";
    private static final String LOCATION = "location";
    private static final String CITY = "city";

    public static void main(String[] args) throws IOException {
        //    OkHttpClient client = new OkHttpClient();
        //     Request request = new Request.Builder()
        //            .url("http://dataservice.accuweather.com")
        //             .build();

//        Responce responce = client.newCall(request).execute();
        //      String body = responce.body().string();

        //    OkHttpClient client = new OkHttpClient();
        //  HttpUrl url = new HttpUrl.Builder()
        //        .scheme("http")
        //      .host(HOST)
        //    .addPathSegment(LOCATION)
        //  .addPathSegment(CITY)
        //.addPathSegment(TOWN_KEY)
        //               .addQueryParameter("apikey", API_KEY)
        //             .addQueryParameter("language", "ru-en")
        //           .build();


        //    Request requesthttp = new Request.Builder()
        //          .addHeader("accept, application/json")
        //               .url(url)
        //             .build();

        //    String jsonResponce = client.newCall(requesthttp).execute().body().string();
        //    System.out.println(jsonResponce);
    }

}
