import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
    ArrayList <Medicine> medicines = new ArrayList<>();
    Medicine paracetamol = new Medicine("Paracetamol 100mg",5.00,150,"12.12.2025");
    Medicine analgin = new Medicine("Analgin",8.50,300,"24.08.2028");
    Medicine nurofen = new Medicine("Nurofen max",11.20,70,"05.03.2023");

    medicines.add(paracetamol);
    medicines.add(analgin);
    medicines.add(nurofen);


    }
}

