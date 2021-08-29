package Lesson7;

import com.fasterxml.jackson.databind.ObjectMapper;
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
        public static final String METRIC = "true";

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
                    .addQueryParameter("metric",METRIC)
                    .build();

            Request request = new Request.Builder()
                    .url(url)
                    .build();

            Response response = client.newCall(request).execute();
            ObjectMapper objectMapper = new ObjectMapper();
            WetherResponse wetherResponse = objectMapper.readValue(response.body().byteStream(), WetherResponse.class);

            for (DailyForecast forecast : wetherResponse.getDailyForecast()){
                System.out.printf("Погода в Петрозаводске на %s\n", forecast.getDate(),
                        forecast.getDay().getIconPhrase(),
                        forecast.getTemperature().getMinimum().getValue(),
                        forecast.getTemperature().getMaximum().getValue(),
                        forecast.getTemperature().getMinimum().getUnit());
            }

            System.out.println(Objects.requireNonNull(response.body()).string());
        }
    }


