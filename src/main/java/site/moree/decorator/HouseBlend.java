package site.moree.decorator;

/**
 * Created by MORE-E on 4/17/2017.
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return .89;
    }
}
