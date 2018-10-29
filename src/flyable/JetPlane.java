package flyable;

import tower.WeatherTower;

/**
 * Created by msemenov on 10/29/18.
 */
public class JetPlane extends Aircraft implements Flyable {
    private WeatherTower weatherTower;
    JetPlane(String name, Coordinates coordinates){
        super(name, coordinates);
    }
    public void updateConditions(){

    }
    @Override
    public void registerTower(WeatherTower weatherTower) {
        this.weatherTower = weatherTower;
    }

}
