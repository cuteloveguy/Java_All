package DesignModule.behavior_Pattern.JDK_Observer_Pattern;

public class Main {
    public static void main(String[] args) {
        WetherStation wetherStation = new WetherStation();
        Display display1 = new Display();
        Display display2 = new Display();
        wetherStation.addObserver(display1);
        wetherStation.addObserver(display2);
        wetherStation.setMeasurements(30.0f,20.0f,10.0f);
        wetherStation.deleteObserver(display1);
        wetherStation.setMeasurements(10.0f,20.0f,30.0f);

    }
}
