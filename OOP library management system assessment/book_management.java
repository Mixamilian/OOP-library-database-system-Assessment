public class book_management {

    // attributes
    private int bookID;
    private String Title;
    private String Author;
    private String Category;
    private String AvailabilitySatus;

    //constructor
    public book_management(int bookID, String Title, String Author, String Category, String AvailabilityStatus){
        this.bookID = bookID;
        this.Title = Title;
        this.Author = Author;
        this.Category = Category;
        this.AvailabilitySatus = AvailabilityStatus;
    }

    //Getters
    public int getBookID(){
        return this.bookID;
    }

    public String getTitle(){
        return this.Title;
    }

    public String getAuthor(){
        return this.Author;
    }

    //setter
    public void setAvailabilityStatus(String newAvailabilityStatus){
        this.AvailabilitySatus = newAvailabilityStatus;
    }

    //delete function
    public void deleteBookRecord(){

    }

}