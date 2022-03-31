package abstractfactory;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory cpuFactory = FactoryProducer.getFactory("CPU");
        CPU ibmcpu = cpuFactory.getCPU("IBM");
        ibmcpu.makeCPU();

        AbstractFactory memoryFactory = FactoryProducer.getFactory("memory");
        memory kingston = memoryFactory.getMemory("Kingston");
        kingston.makeMemory();
    }
}
