package flyable;


import flyable.Coordinates;
import flyable.Flyable;
import flyable.Helicopter;

public abstract class AircraftFactory {
    public static Flyable newAircraft(String type, String name, int longitude, int latitude, int height ) {
        Flyable ret = null;
        switch (type) {
            case ("Helicopter"): {
               ret = new Helicopter(name, new Coordinates(longitude, latitude, height));
               break;
            }
            case ("JetPlane"): {
               ret = new JetPlane(name, new Coordinates(longitude, latitude, height));
                break;
            }
            case ("Baloon"): {
               ret = new Baloon(name, new Coordinates(longitude, latitude, height));
            }

        }
        return ret;
    }
}
