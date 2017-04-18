package site.moree.observer.buildin.push;

import java.util.Observable;

/**
 * Created by MORE-E on 4/17/2017.
 * 使用推模式
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity; // 湿度
    private float pressure;

    public void measurementChanged() {
        setChanged();
        // 只能设置一个推送参数，将其化为数组传送
        notifyObservers(new float[] {temperature, humidity, pressure});
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }
}
