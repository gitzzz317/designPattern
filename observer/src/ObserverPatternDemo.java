public class ObserverPatternDemo {
    public static void main(String[] args) {
        User1 user1 = new User1("小明","123");
        User2 user2 = new User2("小红","123");
        FlowerWebsite flowerWebsite = new FlowerWebsite();

        flowerWebsite.addObserver(user1);
        flowerWebsite.addObserver(user2);

        flowerWebsite.setFlower("今日新品，玫瑰花！");

    }
}
