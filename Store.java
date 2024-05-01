import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Store {
    private List<Rental> rentals;
    private List<Video> videos;
    private int money;

    public Store() {
        this.rentals = new ArrayList<>();
        videos = new ArrayList<>();
        this.videos.add(new NewRelease("Everything Everywhere All at Once"));
        this.videos.add(new NewRelease("The Fabelmans"));
        this.videos.add(new NewRelease("Top Gun"));
        this.videos.add(new NewRelease("Black Panther"));
        this.videos.add(new Drama("Nomadland"));
        this.videos.add(new Drama("The Irishman"));
        this.videos.add(new Drama("Marriage Story"));
        this.videos.add(new Drama("Joker"));
        this.videos.add(new Comedy("Jojo Rabbit"));
        this.videos.add(new Comedy("The Grand Budapest Hotel"));
        this.videos.add(new Comedy("Knives Out"));
        this.videos.add(new Comedy("Ted Lasso"));
        this.videos.add(new Romance("La La Land"));
        this.videos.add(new Romance("The Notebook"));
        this.videos.add(new Romance("Pride"));
        this.videos.add(new Romance("Amelie"));
        this.videos.add(new Horror("Get Out"));
        this.videos.add(new Horror("Hereditary"));
        this.videos.add(new Horror("The Witch"));
        this.videos.add(new Horror("It Follows"));

        this.money = 0;
    }

    public void rent(Customer customer, int day) {
        int numRent = customer.getNumRent(this.videos.size());
        int night = customer.getNight();
        // List<Video> selectedVideos = this.videos.subList(0, numRent);
        List<Video> selectedVideos = new ArrayList<>(this.videos.subList(0, numRent));
        int money = 0;
        for (int i = 0; i < numRent; i++) {
            money += this.videos.get(0).getPrice() * night;
            this.videos.remove(0);
        }

        rentals.add(new Rental(customer, selectedVideos, night, day + night - 1, money));
        this.money += money;
    }

    public void shuffleVideo() {
        Collections.shuffle(videos);
    }

    public int getNumVideo() {
        return this.videos.size();
    }

    // public void receive(int day) {
    // for (Rental rental : rentals) {
    // if (day == rental.getDay()) {
    // List<Video> videos = rental.getVideos();
    // Customer customer = rental.getCustomer();
    // this.videos.addAll(videos);
    // customer.setNumVideo(customer.getNumVideo() - videos.size());
    // rentals.remove(rental);
    // }
    // }
    // }

    // public void receive(int day) {
    // Iterator<Rental> iterator = this.rentals.iterator();
    // while (iterator.hasNext()) {
    // Rental rental = iterator.next();
    // if (day == rental.getDay()) {
    // List<Video> videos = rental.getVideos();
    // Customer customer = rental.getCustomer();
    // this.videos.addAll(videos);
    // customer.setNumVideo(customer.getNumVideo() - videos.size());
    // iterator.remove();
    // }
    // }
    // }

    public List<Rental> getRentals(){
        return rentals;
    }

    public void receive(Rental rental) {
        List<Video> videos = rental.getVideos();
        Customer customer = rental.getCustomer();
        this.videos.addAll(videos);
        customer.setNumVideo(customer.getNumVideo() - videos.size());
        this.rentals.remove(rental);
    }

    public void display() {
        System.out.println("Number of videos: " + this.videos.size());
        for (Video video : this.videos) 
            System.out.println(video.getName());

        System.out.print('\n');
        System.out.println("Amount of money: " + this.money);
    }

    public void displayRental(){
        System.out.println("Active rentals:");
        for(Rental rental : this.rentals)
            rental.display();
    }

    // public void addRental(Customer customer){
    // Map<String, Integer> rent = customer.tryRent();
    // if(rent.get("video") + customer.getNumVideo() > Customer.maxVideo){
    // return;
    // }

    // }
}
