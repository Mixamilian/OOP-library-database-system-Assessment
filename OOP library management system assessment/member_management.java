public class member_management{

    //attributes
    private int memberID;
    private String Name;
    private String Email;
    private String MembershipType;

    //constructor
    public member_management(int memberID, STRING Name, STRING Email, STRING MembershipType){
        this.memberID = memberID;
        this.Name = Name;
        this.Email = Email;
        this.MembershipType = MembershipType;
    }

    //Getters
    public getName(){
        return this.Name;
    }

    public getMemberID(){
        return this.memberID;
    }

    //setters

    public setMemberID(int newMemberID){
        this.memberID = newMemberID
    }

    public setName(STRING newName){
        this.Name = newName;
    }

    public setEmail(STRING newEmail){
        this.Email = newEmail;
    }

    public setMembershipType(STRING newMembershipType){
        this.MembershipType = newMembershipType;
    }

    //delete function
    public deleteMember(){
        
    }
}