public interface IFlowerWebsite {
    //添加观察者时，提示欢迎
    void welcomeUser(Observer observer);
    //设置鲜花状态
    void setFlower(String msg);
}
