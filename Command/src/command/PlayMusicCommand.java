package command;

import receivers.Receiver;

public class PlayMusicCommand implements Command{
    private Receiver receiver;

    public PlayMusicCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.doSomething();
    }
}
