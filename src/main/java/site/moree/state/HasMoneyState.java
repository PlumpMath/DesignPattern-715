package site.moree.state;

/**
 * Created by MORE-E on 4/18/2017.
 */
public class HasMoneyState implements State {
    public static final State HAS_MONEY_STATE = new HasMoneyState();

    @Override
    public void insertMoney() {
        System.out.println("You can not insert money again.");
    }

    @Override
    public void rejectMoney() {
        System.out.println("Money returned.");
    }

    @Override
    public void takeCandy() {
        System.out.println("Enjoy sweet candy!");
    }
}
