import java.util.Objects;

public class Medicine {


    private String name;
    private int quantity;
    private double price;
    private String description;
    public Medicine(String name) {
        this.name = name;
    }
    public Medicine(String name, int quantity, double price, String description) {

        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.description = description;

    }
    public Medicine(Medicine m, int quantity) {
        this.name = m.name;
        this.quantity = quantity;
        this.price = m.price;
        this.description = m.description;

        m.quantity = m.quantity - quantity;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Medicine other = (Medicine) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void reduceBy(int quant) {
        this.quantity = this.quantity - quant;

    }
}