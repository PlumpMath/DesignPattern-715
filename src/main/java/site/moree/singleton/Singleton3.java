package site.moree.singleton;

/**
 * Created by MORE-E on 4/18/2017.
 * 只有第一次实例化时才会同步；volatile保证了实例化之后，能立即被使用，不会被实例化两次
 */
public class Singleton3 {
    private volatile static Singleton3 instance;

    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}
