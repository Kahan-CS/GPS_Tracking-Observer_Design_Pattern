package display;

import backend.GPS;

import java.util.Scanner;

public class CarGUI {
    public static void main(String[] args) {
        GPS gps = new GPS();
        CurrentLocationDisplay currentLocationDisplay = new CurrentLocationDisplay();
        TotalTravelledDistanceDisplay totalDistanceDisplay = new TotalTravelledDistanceDisplay();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Car journey started from (0,0). Enter coordinates to travel.");

        while (true) {
            System.out.print("Enter next coordinates (or type 'end' to finish): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("end")) {
                System.out.println("Trip ended. Restarting from (0,0).");
                gps.changeLocation(0, 0);  // Reset the trip to the origin
            } else {
                try {
                    // Parse user input as coordinates
                    String[] coordinates = input.split(",");
                    int newX = Integer.parseInt(coordinates[0].trim());
                    int newY = Integer.parseInt(coordinates[1].trim());

                    // Update the location and display information
                    gps.changeLocation(newX, newY);
                    currentLocationDisplay.displayCurrentLocation(gps);
                    totalDistanceDisplay.displayTotalDistance(gps);

                } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                    System.out.println("Invalid input. Please enter valid coordinates.");
                }
            }
        }
    }
}
