package backend;

public class TotalTravelledDistance {
    private double totalDistance;

    public TotalTravelledDistance()
    {
        totalDistance = 0;
    }


    public void resetTotalDistance()
    {
        totalDistance = 0;
    }

    public void updateTotalDistance(double distanceTraveled)
    {
        totalDistance += distanceTraveled;
    }

    public double getTotalDistance() {
        return totalDistance;
    }
}
