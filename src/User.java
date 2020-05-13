import java.util.Scanner;

public class User {
    // info: fields, we write them in :camelCase
    //what class has
    String firstName;
    String lastName;
    String userAddress;
    String userEmail;
    int userPhone;
    public void newUser(){

         Scanner userSc = new Scanner(System.in);
         System.out.println("Enter First Name: ");
         String firstName = userSc.next();

        System.out.println("Enter Last Name: ");
         String lastName = userSc.next();

        System.out.println("Enter Street #: ");
         String userAddress = userSc.next();

        System.out.println("Enter E-mail: ");
         String userEmail = userSc.next();

        System.out.println("Enter Phone: ");
        long userPhone = userSc.nextLong();

        System.out.println("Thank you for signing in " + firstName + " " + lastName + ".");
    }
}




