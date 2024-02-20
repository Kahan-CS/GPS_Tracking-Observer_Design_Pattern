package display;

import backend.GPS;
import backend.Location;

import java.util.Scanner;

public class CarGUI {
    public CarGUI() {
        GPS gps = new GPS();
        CurrentLocationDisplay currentLocationDisplay = new CurrentLocationDisplay();
        TotalTravelledDistanceDisplay totalDistanceDisplay = new TotalTravelledDistanceDisplay();
        DangerZoneDisplay dangerZoneDisplay = new DangerZoneDisplay();

        gps.addObserver(currentLocationDisplay);
        gps.addObserver(totalDistanceDisplay);
        gps.addObserver(dangerZoneDisplay);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Car journey started from (0,0).");

        boolean guiActivated = true;

        while (guiActivated)
        {
            System.out.print("\n Enter coordinates (format: 'x,y') (or type 'end' to finish, or 'quit' to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("end"))
            {
                System.out.println("Trip ended. Restarting from (0,0).");
                gps.resetTrip();
                totalDistanceDisplay.reset();
            }
            else if (input.equalsIgnoreCase("quit"))
            {
                System.out.println("Trip ended. Quitting program...");
                gps.resetTrip();
                totalDistanceDisplay.reset();
                guiActivated = false;
            }
            else {
                try {
                    // Parse user input as coordinates
                    String[] coordinates = input.split(",");
                    double newX = Double.parseDouble(coordinates[0]);
                    double newY = Double.parseDouble(coordinates[1]);

                    gps.changeLocation(new Location(newX, newY));

                }
                catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                    System.out.println("Invalid input. Please enter valid coordinates.");
                }
            }
        }
    }
}
