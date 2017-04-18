package site.moree.command;

/**
 * Created by MORE-E on 4/18/2017.
 */
public class CommandPattern {
    public static void main(String[] args) {
        SimpleControl simpleControl = new SimpleControl();
        Command command = new LightOnCommand(new Light());

        // 对外使用simpleControl控制
        simpleControl.setCommand(command);
        simpleControl.buttonPressed();
    }
}
