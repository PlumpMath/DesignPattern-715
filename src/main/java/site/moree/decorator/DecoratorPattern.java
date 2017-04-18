package site.moree.decorator;

/**
 * Created by MORE-E on 4/17/2017.
 */
public class DecoratorPattern {
    public static void main(String[] args) {
        Beverage beverage =  new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        // double mocha
        Beverage beverageWithDoubleMocha= new Mocha(new Mocha(beverage));
        System.out.println(beverageWithDoubleMocha.getDescription() + " $" + beverageWithDoubleMocha.cost());

        // with mocha and whip
        Beverage beverageWithMochaAndWhip = new Mocha(new Whip(beverage));
        System.out.println(beverageWithMochaAndWhip.getDescription() + " $" + beverageWithMochaAndWhip.cost());
    }
}
