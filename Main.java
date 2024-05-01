import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Construct objects
        List<Customer> customers = new ArrayList<>();
        customers.add(new Breezy("Emily"));
        customers.add(new Breezy("Lucas"));
        customers.add(new Breezy("Grace"));
        customers.add(new Breezy("Nathan"));
        customers.add(new Hoarder("Isabella"));
        customers.add(new Hoarder("Ethan"));
        customers.add(new Hoarder("Olivia"));
        customers.add(new Regular("Jacob"));
        customers.add(new Regular("Ava"));
        customers.add(new Regular("Liam"));

        Store store = new Store();
        Random random = new Random();

        // Simulation
        for (int day = 0; day < 35; day++) {
            Collections.shuffle(customers);
            store.shuffleVideo();

            // Stop receiving. NumTry customers try to rent.
            int numTry = random.nextInt(customers.size()) + 1;
            for (int i = 0; i < numTry; i++) {
                int numVideo = store.getNumVideo();
                if (numVideo == 0) // The store has zero videos.
                    break;

                if (customers.get(i).getNumVideo() == 3) // Customers are allowed to have at most three videos.
                    continue;

                store.rent(customers.get(i), day);
            }

            // Stop renting, and start to recieve.
            List<Rental> toReceive = new ArrayList<>();
            for (Rental rental : store.getRentals()) {
                if (rental.getDay() == day) {
                    rental.display();
                    toReceive.add(rental);
                }
            }

            toReceive.forEach(store::receive);
        }

        // Display result
        System.out.print('\n');
        store.display();
    }
}
