package abstractfactory;

public abstract class AbstractFactory {
    public abstract CPU getCPU(String CPU);
    public abstract memory getMemory(String memory);
}
