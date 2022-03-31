package abstractfactory;

public class CPUFactory extends AbstractFactory {
    @Override
    public CPU getCPU(String CPU) {
        if (CPU == null){
            return null;
        }
        if (CPU.equals("IBM")){
            return new IBMCPU();
        }else if (CPU.equals("ADM")){
            return new ADMCPU();
        }
        return null;
    }

    @Override
    public memory getMemory(String memory) {
        return null;
    }
}
