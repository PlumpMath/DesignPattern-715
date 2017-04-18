package site.moree.state;

/**
 * Created by MORE-E on 4/18/2017.
 */
public class CandyMachine {
    private State state = NoMoneyState.NO_MONEY_STATE;

    // 可由其它类来控制状态变量
    public void setState(State state) {
        this.state = state;
    }

    public void insertMoney() {
        state.insertMoney();
    }

    public void takeCandy() {
        state.takeCandy();
    }
}
