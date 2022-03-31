package abstractfactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if (choice.equals("CPU")){
            return new CPUFactory();
        }else if (choice.equals("memory")){
            return new MemoryFactory();
        }
        return null;
    }
}
