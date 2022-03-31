package abstractfactory;

public class KingstonMemory implements memory {

    @Override
    public void makeMemory() {
        System.out.println("内存品牌：金士顿，型号为XXX。");
    }
}
