package site.moree.command;

/**
 * Created by MORE-E on 4/18/2017.
 */
public class LightOnCommand implements Command {
    // 具体命令执行者
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    // 使用命令执行接口，调用具体对象执行
    public void execute() {
        light.on();
    }
}
