package display;

import backend.GPS;

public class TotalTravelledDistanceDisplay {
    public void displayTotalDistance(GPS gps) {

        System.out.println("Total Distance Traveled: " + gps.getTotalDistance());
    }
}
