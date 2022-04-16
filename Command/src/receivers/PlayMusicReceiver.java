package receivers;

public class PlayMusicReceiver implements Receiver{
    @Override
    public void doSomething() {
        System.out.println("播放音乐");
    }
}
