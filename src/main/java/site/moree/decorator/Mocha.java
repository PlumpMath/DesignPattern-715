package site.moree.decorator;

/**
 * Created by MORE-E on 4/17/2017.
 * 具体的装饰者，必须持有一个Beverage类
 */
public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
