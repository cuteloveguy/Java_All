package DesignModule.behavior_Pattern.Observer_Pattern;

import java.util.ArrayList;
import java.util.List;

public class WetherStation implements Subject{
    private List<Obsever> obsevers;
    private float temperature;
    private float homidity;
    private float pressure;

    public WetherStation(){
        this.obsevers = new ArrayList<>();
    }


    @Override
    public void registerObserver(Obsever obsever) {
        obsevers.add(obsever);
    }

    @Override
    public void removeObserver(Obsever obsever) {
        obsevers.remove(obsever);
    }

    @Override
    public void notifyObservers() {
        System.out.println("通知所有观察者");
        for (Obsever obsever : obsevers) {
            System.out.println("------------观察者"+obsever.name()+"---------");
            obsever.update(temperature,homidity,pressure);
        }
    }

    public void setMeasurements(float temperature,float homidity,float pressure){
        this.temperature = temperature;
        this.homidity = homidity;
        this.pressure = pressure;
        notifyObservers();
    }
}
