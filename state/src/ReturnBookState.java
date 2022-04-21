public class ReturnBookState implements BookState{
    @Override
    public void borrowBook(Context context) {
        System.out.println("图书借阅！状态改变！");
        context.changeState(context.getBorrowBookState());
    }

    @Override
    public void returnBook(Context context) {
        System.out.println("图书已归还，无需重复归还");
    }
}
