package site.moree.decorator;

/**
 * Created by MORE-E on 4/17/2017.
 */
public abstract class Beverage {
    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
