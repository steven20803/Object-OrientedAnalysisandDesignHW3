import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Store {
    private List<Rental> rentals;
    private List<Video> videos;
    private int earning;

    public Store(){
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
    }

    public void addRental(Customer customer){
        Map<String, Integer> rent = customer.tryRent();
        if(rent.get("video") + customer.getNumVideo() > Customer.maxVideo){
            return;
        }

        
    }
}
