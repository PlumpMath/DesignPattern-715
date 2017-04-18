package site.moree.adapter;

/**
 * Created by MORE-E on 4/18/2017.
 */
public class MallardDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("MallardDuck quack.");
    }

    @Override
    public void fly() {
        System.out.println("MallardDuck can fly 100 meters.");
    }
}
