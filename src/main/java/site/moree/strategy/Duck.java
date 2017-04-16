package site.moree.strategy;

import site.moree.strategy.fly.FlyBehavior;
import site.moree.strategy.quack.QuackBehavior;

/**
 * Created by MORE-E on 4/16/2017.
 * 1. 找出类中变和不变的部分，将可变的部分独立开来，这里抽象出了fly和quack两个接口
 * 2. 针对接口编程，而不针对实现：如在performFly方法中是使用flyBehavior接口的fly方法，这样不与具体实现绑定
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public abstract void display();

    // 变化的部分：不是所有的鸭子都会飞，使用接口，具体实现由子类决定
    public void performFly() {
        flyBehavior.fly();
    }

    // 变化的部分：不同的鸭子叫法不同，使用接口，具体实现由子类决定
    public void performQuack() {
        quackBehavior.quack();
    }

    // 可以动态改变行为
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    // 不变的部分
    public void swim() {
        System.out.println("All ducks can swim.");
    }
}
