package site.moree.adapter;

/**
 * Created by MORE-E on 4/18/2017.
 * 关键的适配器，TurkeyAdapter 即 Turkey -> Duck 的适配器
 */
public class TurkeyAdapter implements Duck {
    // 待转换类
    private Turkey turkey;

    // 构造方法中引入待转换类
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}