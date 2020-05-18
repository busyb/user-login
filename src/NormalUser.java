public class NormalUser extends User {

    @Override
    public String buildUserConfirmationMessage(){
        return  "Thank you for registering: " + getFirstName() + " " + getLastName() + ".";
    }

    public void test()
    {

    }}
