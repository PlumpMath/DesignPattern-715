package site.moree.singleton;

/**
 * Created by MORE-E on 4/18/2017.
 * 提前实例化好，保证了线程安全，同时减少同步等待
 */
public class Singleton2 {
    private static Singleton2 instance = new Singleton2();

    public static Singleton2 getInstance() {
        return instance;
    }
}
