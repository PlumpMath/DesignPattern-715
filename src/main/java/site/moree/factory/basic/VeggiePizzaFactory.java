package site.moree.factory.basic;

import site.moree.factory.pizza.Pizza;
import site.moree.factory.pizza.VeggiePizza;

/**
 * Created by MORE-E on 4/17/2017.
 * 只能生成培根的工厂
 */
public class VeggiePizzaFactory extends PizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        if ("veggie".equals(type)) {
            return new VeggiePizza();
        } else {
            throw new IllegalArgumentException("type is illegal.");
        }
    }
}
