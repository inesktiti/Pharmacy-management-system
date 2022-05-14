//Barcha khadhan ya frr

public class Main {
    public static void main( String[] args) {
        Person thePerson = new Person("Default", "Default", "Default", 00000000, 000000000);
        Staff pharmacien = new Staff("Khalil", "Liouaine", "Tunis", 00000000, 00000000, "Khalil@00000000");
        Medicine panadol = new Medicine("Panadol", 10, 1.9, "Paracetamol");
        Prescription ordonnance = new Prescription("Slimene Labyeth", panadol);
        Client amine = new Client("Amine", "Ben Hassouna", "Ain Zaghouain", 999999,55258528, ordonnance);
        Stock availalable = new Stock();

    }
}
