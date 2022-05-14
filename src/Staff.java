public class Staff extends Person {
    private String password;

    public Staff(String name, String lastName, String address, long CIN, long phoneNumber, String password) {
        super(name, lastName, address, CIN, phoneNumber);
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
