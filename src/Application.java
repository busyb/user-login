public class Application {

    // todo: pass information thur command line
    public static void main(String[] args) {
        User loginUser = new User();

        loginUser.setFirstName("Dr.Strange");
        loginUser.setLastName("Rice");
        // what caller(this class) to set phone, but cannot share phone num with the world
        loginUser.setPhone(555);
        loginUser.setAddress("empty");


        // prove user exist, show his details
        // hidden address and phone
        System.out.println(loginUser.getFirstName() + " " +
                loginUser.getLastName());
    }
}
