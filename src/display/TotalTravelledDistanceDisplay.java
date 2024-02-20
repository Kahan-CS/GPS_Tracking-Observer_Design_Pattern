package display;

import backend.Location;
import backend.TotalTravelledDistance;
import observer_design.Observer;

public class TotalTravelledDistanceDisplay implements Observer {

    private TotalTravelledDistance travelledDistance = new TotalTravelledDistance();
    private Location lastLocation = new Location(0,0);

    public void update(Location newLocation) {

        double distance = lastLocation.distance(newLocation);
        travelledDistance.updateTotalDistance(distance);
        System.out.println("Total Distance Traveled: " + travelledDistance.getTotalDistance());
        lastLocation = newLocation;
    }

    public void reset()
    {
        travelledDistance.resetTotalDistance();
        lastLocation = new Location(0,0);
    }
}
