package site.moree.singleton;

/**
 * Created by MORE-E on 4/18/2017.
 * 最简单的单例，注意多线程同步
 */
public class Singleton1 {
    private static Singleton1 instance;

    // 构造器是私有的
    private Singleton1() {
        // init something
    }

    public static synchronized Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}
