public class Person {
    private String name;
    private String lastName;
    private String address;
    private long CIN;
    private long phoneNumber;

    public Person(String name, String lastName, String address, long CIN, long phoneNumber) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.CIN = CIN;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public long getCIN() {
        return CIN;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }
}
