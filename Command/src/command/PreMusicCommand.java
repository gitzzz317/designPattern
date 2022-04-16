package command;

import receivers.Receiver;

public class PreMusicCommand implements Command{
    private Receiver receiver;

    public PreMusicCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.doSomething();
    }
}
