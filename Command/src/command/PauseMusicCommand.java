package command;

import receivers.Receiver;

public class PauseMusicCommand implements Command{
    private Receiver receiver;

    public PauseMusicCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.doSomething();
    }
}
