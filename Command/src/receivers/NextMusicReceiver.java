package receivers;

public class NextMusicReceiver implements Receiver{
    @Override
    public void doSomething() {
        System.out.println("下一首");
    }
}
