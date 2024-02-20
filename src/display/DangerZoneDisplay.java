package display;

import backend.GPS;

public class DangerZoneDisplay {
    public void displayAlarm(GPS gps) {
        if (gps.isInDangerZone()) {
            // Logic to display the danger zone alarm
            System.out.println("\n********** DANGER DETECTED!!!!!!!!! ***************/\n Danger Zone Alarm!\n");
        }
        else {
            System.out.println("SAFE! No danger detected");
        }
    }
}
