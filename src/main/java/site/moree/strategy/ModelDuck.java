package site.moree.strategy;

import site.moree.strategy.fly.FlyNoWay;
import site.moree.strategy.quack.Squeak;

/**
 * Created by MORE-E on 4/16/2017.
 * 可以很方便地继承Duck类，构造不同行为的子类
 */
public class ModelDuck extends Duck {
    // 构造时注入具体实现类
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I am a model duck.");
    }
}
