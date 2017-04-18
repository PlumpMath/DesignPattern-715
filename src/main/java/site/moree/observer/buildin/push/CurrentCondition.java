package site.moree.observer.buildin.push;

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
        if (arg instanceof float[]) {
            float[] data = (float[]) arg;
            temperature = data[0];
            humidity = data[1];
            pressure = data[2];
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
