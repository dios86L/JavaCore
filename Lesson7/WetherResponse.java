package Lesson7;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WetherResponse {
    @JsonProperty ("DailyForcasts")
    private List<DailyForecast> dailyForecasts;

    public WetherResponse(){

    }

    public WetherResponse(List<DailyForecast> dailyForecasts){
        this.dailyForecasts = dailyForecasts;
    }
    public List<DailyForecast> getDailyForecast(){
        return dailyForecasts;
    }
    public void setDailyForecasts(List<DailyForecast> dailyForecasts){
        this.dailyForecasts = dailyForecasts;
    }
    @Override
    public String toString(){
        return "WetherResponse { dailyForcasts=" + dailyForecasts + "}";
    }
}
