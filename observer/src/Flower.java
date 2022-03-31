public interface Flower {
    //添加观察者
    void addObserver(Observer observer);
    //移除观察者
    void deleteObserver(Observer observer);
    //通知所有观察者
    void notifyAll(String msg);
}
