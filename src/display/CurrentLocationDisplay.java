package display;

import backend.GPS;

public class CurrentLocationDisplay {
    public void displayCurrentLocation(GPS gps) {
        System.out.println("Current Location: (" + gps.getCurrentLocation().getX() + ", " + gps.getCurrentLocation().getY() + ")");
    }
}
