public class User1 implements Observer{
    private String name;
    private String password;

    public User1() {
    }

    public User1(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void update(String msg) {
        System.out.println(this.getName() + "收到推送: " +msg);
    }

    @Override
    public void welcomeMy() {
        System.out.println("注册成功！欢迎您：" + this.getName());
    }
}
