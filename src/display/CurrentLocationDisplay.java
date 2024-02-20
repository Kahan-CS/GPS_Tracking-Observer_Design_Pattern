package display;

import backend.GPS;
import observer_design.Observer;
import backend.Location;
public class CurrentLocationDisplay implements Observer {
    public void update(Location location) {
        System.out.println("Current Location: (" + location.getX() + ", " + location.getY() + ")");
    }
}
