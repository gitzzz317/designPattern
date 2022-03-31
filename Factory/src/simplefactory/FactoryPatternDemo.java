package simplefactory;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        SimpleMwoFactory simpleMwoFactory = new SimpleMwoFactory();
        Mwo meide = simpleMwoFactory.GetMwo("Meidi");
        meide.makeMwo();
        Mwo geli = simpleMwoFactory.GetMwo("Geli");
        geli.makeMwo();
    }
}
