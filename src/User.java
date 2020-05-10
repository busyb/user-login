public class User {
    // info: fields, we write them in :camelCase
    //what class has
    private String firstName;
    private String lastName;
    private String address;
    private int phone;


    //what class does

    //return nothing
    public void setPhone(int inputPhone){
        phone = inputPhone;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
