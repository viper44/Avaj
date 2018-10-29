package weatherProvider;

import flyable.Coordinates;

/**
 * Created by msemenov on 10/29/18.
 */
public class WeatherProvider {
    private WeatherProvider weatherProvider;
    private String[] weather;
    private WeatherProvider(){

    }
    public WeatherProvider getProvider(){
        return weatherProvider;
    }
    public String getCurrentWeather(Coordinates coordinates){
        return " ";
    }
}
