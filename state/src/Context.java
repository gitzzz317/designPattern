public class Context {
    private BookState bookState;
    private BorrowBookState borrowBookState;
    private ReturnBookState returnBookState;

    public Context() {
        borrowBookState = new BorrowBookState();
        returnBookState = new ReturnBookState();
        bookState = returnBookState;
    }

    void borrowBook(){
        bookState.borrowBook(this);
    }

    void returnBook(){
        bookState.returnBook(this);
    }

    void changeState(BookState bookState){
        this.bookState = bookState;
    }

    public BorrowBookState getBorrowBookState(){
        return borrowBookState;
    }

    public ReturnBookState getReturnBookState(){
        return returnBookState;
    }
}
