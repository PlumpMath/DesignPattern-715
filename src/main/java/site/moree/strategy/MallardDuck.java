package site.moree.strategy;

import site.moree.strategy.fly.FlyWithWings;
import site.moree.strategy.quack.Quack;

/**
 * Created by MORE-E on 4/16/2017.
 */
public class MallardDuck extends Duck {
    // 构造时使用具体实现类
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I am a mallard duck.");
    }
}
