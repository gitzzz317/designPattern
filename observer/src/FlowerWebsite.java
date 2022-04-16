import java.util.ArrayList;
import java.util.List;

public class FlowerWebsite implements IFlowerWebsite , Flower{
    private List<Observer> observers = new ArrayList<>();
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
        welcomeUser(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAll(String msg) {
        for (Observer observer : observers) {
            observer.update(msg);
        }
    }


    @Override
    public void welcomeUser(Observer observer) {
        observer.welcomeMy();
    }

    @Override
    public void setFlower(String msg) {
        notifyAll(msg);
    }
}
