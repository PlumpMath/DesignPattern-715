package site.moree.observer.custom;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MORE-E on 4/17/2017.
 */
public class WeatherData implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private float temperature;
    private float humidity; // 湿度
    private float pressure;

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        observers.forEach(observer -> {
            observer.update(temperature, humidity, pressure);
        });
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}
