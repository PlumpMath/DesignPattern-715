package site.moree.observer.custom;

/**
 * Created by MORE-E on 4/17/2017.
 * 主题接口，实现松耦合，主题只知道某个类实现了Observer，并不关心这个类具体做些什么
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
