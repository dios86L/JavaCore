package Lesson6;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.Objects;

public class Main {

    public static final String HOST = "dataservice.accuweather.com";
    public static final String FORECAST_URL = "forecasts";
    public static final String DAILY_URL = "daily";
    public static final String FIVE_DAYS_URL = "5days";
    public static final String API_VERSION = "v1";
    public static final String CITY_ID = "293141";
    public static final String API_KEY = "ntX28Gezn7bAFk8155Qn6urebofe9vGk";
    public static final String LANGUAGE = "ru-ru";
    public static final String MERIC = "true";

    public static void  main (String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient();
        HttpUrl url = new HttpUrl.Builder()
                .scheme("http")
                .host(HOST)
                .addPathSegment(API_VERSION)
                .addPathSegment(DAILY_URL)
                .addPathSegment(FIVE_DAYS_URL)
                .addPathSegment(CITY_ID)
                .addQueryParameter("apikey",API_KEY)
                .addQueryParameter("language",LANGUAGE)
                .addQueryParameter("metric",MERIC)
                .build();

        Request request = new Request.Builder()
                .url(url)
                .build();

        Response response = client.newCall(request).execute();
        System.out.println(Objects.requireNonNull(response.body()).string());
    }
}