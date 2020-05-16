import java.util.Scanner;

public class RegisterUserApplication {

    // todo: pass information thur command line
    public static void main(String[] args) {

        //create user
        User loginUser = new User();
        
        // do action on user -> user with action complete --> put/capture info into user object
        User userWithData = setUserDataFromCommandline(loginUser);

        //print info --> confirm user create
        printOutNewUserName(userWithData);
    }

    // move the method into another class
    private static User setUserDataFromCommandline(User emptyUser){
        Scanner scannerInput = new Scanner(System.in);

        // set data
        System.out.println("Enter First Name: ");
        String firstName = scannerInput.next();
        emptyUser.setFirstName(firstName);

        System.out.println("Enter Last Name: ");
        String lastName = scannerInput.next();
        emptyUser.setLastName(lastName);

        System.out.println("Enter Street #: ");
        String userAddress = scannerInput.next();
        emptyUser.setUserAddress(userAddress);

        System.out.println("Enter E-mail: ");
        String userEmail = scannerInput.next();
        emptyUser.setUserEmail(userEmail);

        System.out.println("Enter Phone: ");
        int userPhone = scannerInput.nextInt();
        emptyUser.setUserPhone(userPhone);

        // now user has data
        return emptyUser;
    }

    // printer
    private static void printOutNewUserName(User userWithData) {
        System.out.println("Thank you for registering: " + userWithData.getFirstName() + " " + userWithData.getLastName() + ".");
    }
}