package DesignModule.behavior_Pattern.Observer_Pattern;

public class Main {
    public static void main(String[] args) {
        WetherStation wetherStation = new WetherStation();
        Display display1 = new Display("1");
        Display display2 = new Display("2");
        wetherStation.registerObserver(display1);
        wetherStation.registerObserver(display2);
        wetherStation.setMeasurements(25.0f,60.0f,1013.0f);
        wetherStation.removeObserver(display1);
        wetherStation.setMeasurements(28.0f,100.0f,1220.0f);


    }
}
