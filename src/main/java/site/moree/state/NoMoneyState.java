package site.moree.state;

/**
 * Created by MORE-E on 4/18/2017.
 */
public class NoMoneyState implements State{
    public static final State NO_MONEY_STATE = new NoMoneyState();

    @Override
    public void insertMoney() {
        System.out.println("You insert a quarter.");
    }

    @Override
    public void rejectMoney() {
        System.out.println("You haven't insert a quarter.");
    }

    @Override
    public void takeCandy() {
        System.out.println("You need to pay first.");
    }
}
