public class borrowing_management{

    //attributes
    private int recordID;
    private int bookID;
    private int memberID;
    private int borrowDate;
    private int dueDate;
    private String returnStatus;

    //constructor
    public borrowing_management(int recordID, int bookID, int memberID, int borrowDate, int dueDate, String returnStatus){
        this.recordID = recordID;
        this.bookID = bookID;
        this.memberID = memberID;
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
        this.returnStatus = returnStatus;
    }

    //Getters
    public int getMemberID(){
        return this.memberID;
    }

    public int getBookID(){
        return this.bookID;
    }

    //Setter
    public void setReturnStatus(String newReturnStatus){
        this.returnStatus = newReturnStatus;
    }

    //delete function
    public void deleteBorrowingRecord(){
        
    }
}