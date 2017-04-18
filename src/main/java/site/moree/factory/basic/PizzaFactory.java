package site.moree.factory.basic;

import site.moree.factory.pizza.Pizza;

/**
 * Created by MORE-E on 4/17/2017.
 * 工厂是个抽象类，具体生成可以有多种方式
 */
public abstract class PizzaFactory {
    public abstract Pizza createPizza(String type);
}
