package DesignModule.behavior_Pattern.Observer_Pattern;

public interface Subject {
    void registerObserver(Obsever obsever);
    void removeObserver(Obsever obsever);
    void notifyObservers();
}
