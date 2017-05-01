package site.moree.proxy;

/**
 * Created by MORE-E on 5/1/2017.
 */
public class RealSubject implements Subject{
    @Override
    public void request() {
        System.out.println("Doing real request...");
    }
}
