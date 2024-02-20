package backend;

public class GPS {
    private Location currentLocation;
    private TotalTravelledDistance totalDistanceTracker;
    private DangerZone dangerZone;

    public GPS() {
        this.currentLocation = new Location(0, 0);
        this.totalDistanceTracker = new TotalTravelledDistance();
        this.dangerZone = new DangerZone();
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public double getTotalDistance() {
        return totalDistanceTracker.getTotalDistance();
    }

    public void changeLocation(int newX, int newY) {
        // Calculate distance traveled based on the new location
        double distanceTraveled = currentLocation.distance(newX, newY);

        // Update the total distance
        totalDistanceTracker.updateTotalDistance(distanceTraveled);

        // Update the current location
        currentLocation.setLocation(newX, newY);
    }

    public boolean isInDangerZone() {
        // Use the DangerZone object directly
        return dangerZone.isInDangerZone(currentLocation);
    }

}
