package command;

import receivers.Receiver;

public class NextMusicCommand implements Command{
    private Receiver receiver;

    public NextMusicCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.doSomething();
    }
}
