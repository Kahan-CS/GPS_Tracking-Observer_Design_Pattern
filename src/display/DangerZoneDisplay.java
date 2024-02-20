package display;

import backend.DangerZone;
import backend.Location;
import observer_design.Observer;

public class DangerZoneDisplay implements Observer {
    
    private DangerZone dangerZone = new DangerZone();
    public void update(Location location) {
        // Logic to display the danger zone alarm
        if (dangerZone.isInDangerZone(location)) {
            System.out.println("\n********** DANGER DETECTED!!!!!!!!! ***************\n Danger Zone Alarm!\n");
        }
        else {
            System.out.println("SAFE! No danger detected");
        }
    }
}
