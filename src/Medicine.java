import java.util.ArrayList;

public class Medicine {
    String name;
    double price;
    int quantity;
    String expirationDate;

    public Medicine(String name, double price, int quantity, String expirationDate) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", expirationDate='" + expirationDate + '\'';
    }

    public static ArrayList <Medicine> AddMedicine(){


        return null;
    }

    public static ArrayList<Medicine> CheckIfMedicineIsExpired() {

        return null;
    }

    public static ArrayList<Medicine> CheckIfPriceIsUnder10() {

        return null;
    }

    public static ArrayList<Medicine> CheckIfPriceIsOver15() {

        return null;
    }
    public static ArrayList<Medicine> CheckExpiredMedicineMoneyLost() {

        return null;
    }

    public static ArrayList<Medicine> ShowExpiredMedicine() {

        return null;
    }

    public static ArrayList<Medicine> ShowAllMedicine() {

        return null;
    }


}
