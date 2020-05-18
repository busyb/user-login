
public class User {
    // info: fields, we write them in :camelCase
    //what class has
   private String firstName;
   private String lastName;
   private String userAddress;
   private String userEmail;
   private int userPhone;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setUserPhone(int userPhone) {
        this.userPhone = userPhone;
    }

    // we can leave it empty --> children will override
    public String buildUserConfirmationMessage(){
        return  "";
    }
}




