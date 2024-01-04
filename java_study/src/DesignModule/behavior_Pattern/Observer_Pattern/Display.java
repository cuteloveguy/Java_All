package DesignModule.behavior_Pattern.Observer_Pattern;

public class Display implements Obsever{
    private float temperature;
    private float homidity;
    private float pressure;
    private String name;

    public Display(String name){
        this.name = name;
    }




    @Override
    public void update(float temperature, float homidity, float pressure) {
        this.temperature = temperature;
        this.homidity = homidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public String name() {
        return this.name;
    }

    public void display(){
        System.out.println("Temperature: "+temperature);
        System.out.println("Homidity: "+homidity);
        System.out.println("Pressure: "+pressure);

    }

}
