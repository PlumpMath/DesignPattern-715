package site.moree.command;

/**
 * Created by MORE-E on 4/18/2017.
 * Receiver角色，命令的真实执行者
 */
public class Light {
    public void on() {
        System.out.println("light on.");
    }

    public void off() {
        System.out.println("light off.");
    }
}
