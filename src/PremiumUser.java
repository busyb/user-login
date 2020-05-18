public class PremiumUser extends User{

    @Override
    public String buildUserConfirmationMessage(){
        return  "Thank you for registering: " + getFirstName() + " " + getLastName() + "." + "You are a premium User*";
    }
}
