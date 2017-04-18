package site.moree.factory.pizza;

/**
 * Created by MORE-E on 4/17/2017.
 */
public class VeggiePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare veggie pizza.");
    }

    @Override
    public void bake() {
        System.out.println("bake veggie pizza.");
    }
}
