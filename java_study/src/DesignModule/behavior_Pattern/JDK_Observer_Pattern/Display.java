package DesignModule.behavior_Pattern.JDK_Observer_Pattern;

import java.util.Observable;
import java.util.Observer;

public class Display implements Observer {
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WetherStation){
            WetherStation wetherStation = (WetherStation) o;
            this.temperature = wetherStation.getTemperature();
            this.humidity = wetherStation.getTemperature();
            this.pressure = wetherStation.getPressure();
            display();

        }

    }

    public void display(){
        System.out.println("Temperature: "+temperature);
        System.out.println("humidity"+humidity);
        System.out.println("pressure"+pressure);
    }

}
