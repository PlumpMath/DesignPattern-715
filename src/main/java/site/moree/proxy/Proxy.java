package site.moree.proxy;

/**
 * Created by MORE-E on 5/1/2017.
 * 代理会持有一个真实的对象，然后与真正的Subject打交道，无论是通过网络、虚拟机还是其它方式
 */
public class Proxy implements Subject {
    private Subject subject;

    Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        subject.request();
    }
}
