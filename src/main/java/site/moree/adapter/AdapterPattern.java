package site.moree.adapter;

/**
 * Created by MORE-E on 4/18/2017.
 */
public class AdapterPattern {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------------------");
        System.out.println("duck:");
        Duck mallardDuck = new MallardDuck();
        mallardDuck.quack();
        mallardDuck.fly();

        System.out.println("--------------------------------------------------------------------");
        System.out.println("turkey:");
        Turkey wildTurkey = new WildTurkey();
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("--------------------------------------------------------------------");
        System.out.println("turkeyAdapter:");
        TurkeyAdapter adapter = new TurkeyAdapter(wildTurkey);
        adapter.quack();
        adapter.fly();
    }
}
