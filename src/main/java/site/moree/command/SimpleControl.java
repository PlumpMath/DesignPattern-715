package site.moree.command;

/**
 * Created by MORE-E on 4/18/2017.
 * Invoker角色，命令的设置/触发者
 */
public class SimpleControl {
    private Command slot;

    // 可以随意切换命令
    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonPressed() {
        slot.execute();
    }
}
