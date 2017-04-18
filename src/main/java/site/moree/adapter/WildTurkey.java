package site.moree.adapter;

/**
 * Created by MORE-E on 4/18/2017.
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("WildTurkey gobble.");
    }

    @Override
    public void fly() {
        System.out.println("WildTurkey can fly 20 meters.");

    }
}
