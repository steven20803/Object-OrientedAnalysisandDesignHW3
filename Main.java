import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Breezy());
        customers.add(new Breezy());
        customers.add(new Breezy());
        customers.add(new Breezy());
        customers.add(new Hoarder());
        customers.add(new Hoarder());
        customers.add(new Hoarder());
        customers.add(new Regular());
        customers.add(new Regular());
        customers.add(new Regular());

        Store store = new Store();
    }
}
