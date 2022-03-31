package abstractfactory;

public class SamsungMemory implements memory{
    @Override
    public void makeMemory() {
        System.out.println("内存品牌：三星，型号为XXX。");
    }
}
