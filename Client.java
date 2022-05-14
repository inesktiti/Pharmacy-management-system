public class Client extends Person {
    private Prescription prescriptions;

    public Client(String name, String lastName, String address, long CIN, long phoneNumber, Prescription prescriptions) {
        super(name, lastName, address, CIN, phoneNumber);
        this.prescriptions = prescriptions;
    }

    public Prescription getPrescriptions() {
        return prescriptions;
    }
}
