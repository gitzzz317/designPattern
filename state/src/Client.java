public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.borrowBook();
        context.borrowBook();
        context.returnBook();
    }
}
