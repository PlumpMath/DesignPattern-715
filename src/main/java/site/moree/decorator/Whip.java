package site.moree.decorator;

/**
 * Created by MORE-E on 4/17/2017.
 * 奶泡装饰者
 */
public class Whip extends CondimentDecorator {

    Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", whip";
    }

    @Override
    public double cost() {
        return 0.51 + beverage.cost();
    }
}
