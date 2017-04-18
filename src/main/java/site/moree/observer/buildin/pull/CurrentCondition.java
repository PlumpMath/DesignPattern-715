package site.moree.observer.buildin.pull;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by MORE-E on 4/17/2017.
 * 接收Observable推送的数据
 */
public class CurrentCondition implements Observer {
    private float temperature;
    private float humidity; // 湿度
    private float pressure;

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            temperature = weatherData.getTemperature();
            humidity = weatherData.getHumidity();
            pressure = weatherData.getPressure();
        }
    }

    public void display() {
        System.out.println("CurrentConditionsDisplay{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}');
    }
}
