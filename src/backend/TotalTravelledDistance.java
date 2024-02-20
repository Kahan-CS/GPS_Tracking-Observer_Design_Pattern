package backend;

public class TotalTravelledDistance {
    private double totalDistance;

    public void updateTotalDistance(double distanceTraveled) {
        totalDistance += distanceTraveled;
    }

    public double getTotalDistance() {
        return totalDistance;
    }
}
