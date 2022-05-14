public class Prescription {
    private String doctorName;
    private Medicine medicines;

    public Prescription(String doctorName, Medicine medicines) {
        this.doctorName = doctorName;
        this.medicines = medicines;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public Medicine getMedicines() {
        return medicines;
    }
}
