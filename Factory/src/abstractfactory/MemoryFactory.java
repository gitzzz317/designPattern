package abstractfactory;

public class MemoryFactory extends AbstractFactory {
    @Override
    public CPU getCPU(String CPU) {
        return null;
    }

    @Override
    public memory getMemory(String memory) {
        if (memory == null){
            return null;
        }
        if (memory.equals("Kingston")){
            return new KingstonMemory();
        }else if (memory.equals("Samsung")){
            return new SamsungMemory();
        }

        return null;
    }
}
