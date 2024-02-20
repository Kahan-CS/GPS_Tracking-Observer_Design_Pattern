import display.CarGUI;
import backend.GPS;

public class Car {
    private GPS gps;

    public Car() {
        this.gps = new GPS();
    }

    public GPS getGps() {
        return gps;
    }

    public void startJourney() {
        CarGUI carGUI = new CarGUI();
    }
}