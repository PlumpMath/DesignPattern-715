package site.moree.strategy;

/**
 * Created by MORE-E on 4/16/2017.
 * 策略模式
 * 定义：定义了算法族，把它们封装起来，让它们之间可以相互替换，算法的实现对于调用者来说是透明的
 * 其实很简单，就是面向接口编程，Duck父类里面使用接口，具体实现的选择由子类决定
 */
public class StrategyPattern {
    public static void main(String[] args) {
        // 使用抽象类的接口，使用具体类构造
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.performQuack();
    }
}
