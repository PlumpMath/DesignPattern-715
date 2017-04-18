package site.moree.observer.buildin.pull;

import java.util.Observable;

/**
 * Created by MORE-E on 4/17/2017.
 * 使用拉模式
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity; // 湿度
    private float pressure;

    public void measurementChanged() {
        setChanged();
        // 通知Observers主动来拉取数据
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

    //---------------------------------------------------------------------------------------
    //  提供拉取数据接口供Observer使用
    //---------------------------------------------------------------------------------------
    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
