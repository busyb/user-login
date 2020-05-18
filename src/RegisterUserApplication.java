import java.util.Scanner;

public class RegisterUserApplication {

    // todo: pass information thur command line
    public static void main(String[] args) {

        //create user
//        User loginUser = new User();
        
        // do action on user -> user with action complete --> put/capture info into user object
        User userWithData = setUserDataFromCommandline();

        //print info --> confirm user create
        printOutNewUserName(userWithData);
    }

    // move the method into another class
    private static User setUserDataFromCommandline(){
        Scanner scannerInput = new Scanner(System.in);
        User emptyUser;

        // determine type of user
        System.out.println("Which type of account, type p - (premium) or type n - (normal)");
        String userType = scannerInput.next();

        //condition if or else

        // else if, do this if the previous condition was not meet

        if(userType.equalsIgnoreCase("n")){
            emptyUser = new NormalUser();
        } else if (userType.equalsIgnoreCase("p")) {
            emptyUser = new PremiumUser();
        } else {
            // throw an error
            throw new RuntimeException("Sorry at this moment we can only create normal or premium users");
        }

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
        System.out.println(userWithData.buildUserConfirmationMessage());
    }
}