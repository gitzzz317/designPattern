import command.PlayMusicCommand;
import receivers.PlayMusicReceiver;
import receivers.Receiver;

public class Client {
    public static void main(String[] args) {
        //调用者
        Invoker invoker = new Invoker();
        //接收者
        Receiver receiver = new PlayMusicReceiver();
        //给接收者发一个命令
        PlayMusicCommand command = new PlayMusicCommand(receiver);
        //
        invoker.setCommand(command);
        invoker.action();
    }
}
