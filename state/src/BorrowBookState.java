public class BorrowBookState implements BookState{
    @Override
    public void borrowBook(Context context) {
        System.out.println("图书已被借阅！无法重复借阅！");
    }

    @Override
    public void returnBook(Context context) {
        System.out.println("图书归还！图书状态改变！");
        context.changeState(context.getReturnBookState());
    }
}
