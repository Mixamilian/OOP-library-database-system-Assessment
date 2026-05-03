public class member_management{

    //attributes
    private int memberID;
    private String Name;
    private String Email;
    private String MembershipType;

    //constructor
    public member_management(int memberID, String Name, String Email, String MembershipType){
        this.memberID = memberID;
        this.Name = Name;
        this.Email = Email;
        this.MembershipType = MembershipType;
    }

    //Getters
    public String getName(){
        return this.Name;
    }

    public int getMemberID(){
        return this.memberID;
    }

    //setters

    public void setMemberID(int newMemberID){
        this.memberID = newMemberID;
    }

    public void setName(String newName){
        this.Name = newName;
    }

    public void setEmail(String newEmail){
        this.Email = newEmail;
    }

    public void setMembershipType(String newMembershipType){
        this.MembershipType = newMembershipType;
    }

    //delete function
    public void deleteMember(){
        
    }
}