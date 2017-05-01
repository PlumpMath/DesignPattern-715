package site.moree.proxy;

/**
 * Created by MORE-E on 5/1/2017.
 * Act as a client that use proxy object to do something.
 */
public class ProxyPattern {
    public static void main(String[] args) {
        // run on server side
        Subject realSubject = new RealSubject();

        // run on client side
        Proxy proxy = new Proxy(realSubject);
        proxy.request();
    }
}
