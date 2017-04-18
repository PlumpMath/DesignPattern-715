package site.moree.observer.custom;

/**
 * Created by MORE-E on 4/17/2017.
 * 观察者接口，使用接口实现松耦合，任何类只要继承Observer，就可以加入事件订阅
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
