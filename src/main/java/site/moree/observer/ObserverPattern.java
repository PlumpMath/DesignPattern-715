package site.moree.observer;

import site.moree.observer.custom.CurrentConditionsDisplay;
import site.moree.observer.custom.WeatherData;

/**
 * Created by MORE-E on 4/17/2017.
 * 定义：
 * 一对多依赖，即对象包含了多个订阅者，当对象状态变化时，包含的订阅者都会收到通知并自动更新
 * 简单点说，保存了一个订阅者表，更新时通知表内所有订阅者
 */
public class ObserverPattern {
    public static void main(String[] args) {
        //---------------------------------------------------------------------------------------
        //  custom test
        //---------------------------------------------------------------------------------------
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay observer1 = new CurrentConditionsDisplay();
        weatherData.registerObserver(observer1);
        weatherData.setMeasurements(28, 50, 100);
        observer1.display();

        CurrentConditionsDisplay observer2 = new CurrentConditionsDisplay();
        weatherData.registerObserver(observer2);
        weatherData.setMeasurements(29, 65, 30);
        observer1.display();
        observer2.display();

        //---------------------------------------------------------------------------------------
        //  build-in pull test
        //---------------------------------------------------------------------------------------
        System.out.println("--------------------------------------------------------------------");
        site.moree.observer.buildin.pull.WeatherData weatherData2 = new site.moree.observer.buildin.pull.WeatherData();

        site.moree.observer.buildin.pull.CurrentCondition observerPull = new site.moree.observer.buildin.pull.CurrentCondition();
        weatherData2.addObserver(observerPull);
        weatherData2.setMeasurements(28, 50, 100);
        observerPull.display();

        //---------------------------------------------------------------------------------------
        //  build-in push test
        //---------------------------------------------------------------------------------------
        System.out.println("--------------------------------------------------------------------");
        site.moree.observer.buildin.push.WeatherData weatherData3 = new site.moree.observer.buildin.push.WeatherData();

        site.moree.observer.buildin.push.CurrentCondition observerPush = new site.moree.observer.buildin.push.CurrentCondition();
        weatherData3.addObserver(observerPush);
        weatherData3.setMeasurements(28, 50, 100);
        observerPush.display();
    }
}
