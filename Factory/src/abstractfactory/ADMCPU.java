package abstractfactory;

public class ADMCPU implements CPU{
    @Override
    public void makeCPU() {
        System.out.println("CPU品牌ADM，型号为XXX。");
    }
}
