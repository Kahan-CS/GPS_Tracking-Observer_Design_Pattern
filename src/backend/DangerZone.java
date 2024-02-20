package backend;

import java.awt.geom.Point2D;

public class DangerZone {

    private Location dangerZoneCenter;
    private double dangerZoneRadius;

    public DangerZone()
    {
        dangerZoneCenter = new Location(6, 6);
        dangerZoneRadius = 3;
    }

    public DangerZone(Location location, double radius)
    {
        dangerZoneCenter = new Location(location.getX(), location.getY());
        dangerZoneRadius = radius;
    }

    public boolean isInDangerZone(Location location)
    {
        return dangerZoneCenter.distance(location) <= dangerZoneRadius;
    }

}
