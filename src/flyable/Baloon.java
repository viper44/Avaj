package flyable;

import tower.WeatherTower;

/**
 * Created by msemenov on 10/29/18.
 */
public class Baloon extends Aircraft implements Flyable{
    private WeatherTower weatherTower;
    Baloon(String name, Coordinates coordinates){
        super(name, coordinates);
    }
    public void updateConditions(){

    }
    @Override
    public void registerTower(WeatherTower weatherTower) {
        this.weatherTower = weatherTower;
    }
}
