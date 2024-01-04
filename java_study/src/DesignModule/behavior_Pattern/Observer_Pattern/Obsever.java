package DesignModule.behavior_Pattern.Observer_Pattern;

public interface Obsever {
    void update(float temperature,float homidity,float pressure);
    String name();
}
