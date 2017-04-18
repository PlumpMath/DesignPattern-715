package site.moree.decorator;

/**
 * Created by MORE-E on 4/17/2017.
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
