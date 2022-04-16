package receivers;

public class PauseMusicReceiver implements Receiver{
    @Override
    public void doSomething() {
        System.out.println("暂停播放");
    }
}
