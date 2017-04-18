package site.moree.factory.pizza;

/**
 * Created by MORE-E on 4/17/2017.
 */
public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare cheese pizza.");
    }

    @Override
    public void bake() {
        System.out.println("bake cheese pizza.");
    }
}
