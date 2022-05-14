import java.util.ArrayList;


public class Stock {


    ArrayList<Medicine> medicineList = new ArrayList<>();

    public ArrayList<Medicine> getMedicineList() {
        return medicineList;
    }

    public Medicine getMedicine(String name, int quantity) throws MedicineNotFound, MedicineOutOfStock {



        int index = this.medicineList.indexOf(new Medicine(name));
        if(index == -1) {
            throw new MedicineNotFound(name);
        }


        Medicine m= medicineList.get(index);

        if(m.getQuantity() < quantity) {
            throw new MedicineOutOfStock(name,m.getQuantity());
        }

        Medicine r= new Medicine(m,quantity);
        return r;
    }

    public class MedicineNotFound extends Exception {

        public MedicineNotFound(String name) {
            super("The medicine '" + name + "' does not exist!");
        }

    }

    public class MedicineOutOfStock extends Exception {
        private int remainedQuantity;

        public MedicineOutOfStock(String name, int remainedQuantity) {

            super("The quantity of the medicine '" + name + "is ="+ remainedQuantity);
        }

        public int getRemainedQuantity() {
            return remainedQuantity;
        }
    }

}
