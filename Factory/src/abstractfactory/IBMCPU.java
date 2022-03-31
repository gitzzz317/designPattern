package abstractfactory;

public class IBMCPU implements CPU{

    @Override
    public void makeCPU() {
        System.out.println("CPU品牌IBM，型号为XXX。");
    }
}
