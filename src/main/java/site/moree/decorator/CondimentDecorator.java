package site.moree.decorator;

/**
 * Created by MORE-E on 4/17/2017.
 * 装饰者抽象类
 */
public abstract class CondimentDecorator extends Beverage {
    // 持有一个Beverage引用
    protected Beverage beverage;

    // 精华所在，构造时传入Beverage类，而自己也是Beverage类
    CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    // 强制覆写接口为抽象，保证子类都重新实现
    public abstract String getDescription();
}
