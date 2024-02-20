package backend;

import observer_design.Observer;
import observer_design.Subject;
import java.util.ArrayList;
import java.util.List;

public class GPS implements Subject {
    private Location currentLocation;

    private List<Observer> observers = new ArrayList<>();


    public GPS() {
        this.currentLocation = new Location(0, 0);
    }


    public void changeLocation(Location location) {

        // Update the current location
        // currentLocation.setLocation(location);
        this.currentLocation = new Location(location.getX(), location.getY());
        notifyObservers();
    }


    public void resetTrip()
    {
        currentLocation.setLocation(0,0);
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(currentLocation);
        }
    }
}
