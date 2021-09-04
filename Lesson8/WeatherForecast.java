package Lesson8;

public class WeatherForecast {
    private final String city;
    private final String localDate;
    private final String weatherText;
    private final Double temperature;

    public WeatherForecast(String city, String localDate, String weatherText, Double temperature){
        this.city = city;
        this.localDate = localDate;
        this.weatherText = weatherText;
        this.temperature = temperature;
    }


    @Override
    public String toString() {
        return "WeatherForecast{" +
                "city='" + city + '\'' +
                ", localDate='" + localDate + '\'' +
                ", weatherText='" + weatherText + '\'' +
                ", temperature=" + temperature +'}';
    }
}
