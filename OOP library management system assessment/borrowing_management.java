public class borrowing_management{

    //attributes
    private int recordID;
    private int bookID;
    private int memberID;
    private int borrowDate;
    private int dueDate;
    private STRING returnStatus;

    //constructor
    public borrowing_management(int recordID, int bookID, int memberID, int borrowDate, int dueDate, STRING returnStatus){
        this.recordID = recordID;
        this.bookID = bookID;
        this.memberID = memberID;
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
        this.returnStatus = returnStatus;
    }

    //Getters
    public getMemberID(){
        return this.memberID;
    }

    public getBookID(){
        return this.bookID;
    }

    //Setter
    public setReturnStatus(STRING newReturnStatus){
        this.returnStatus = newReturnStatus;
    }

    //delete function
    public deleteBorrowingRecord(){
        
    }
}