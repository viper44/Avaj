package flyable;
import tower.WeatherTower;

/**
 * Created by msemenov on 10/29/18.
 */
public interface Flyable {
    public void updateConditions();
    public void registerTower(WeatherTower weatherTower);
}
