import java.util.List;

public class Rental {
    private Customer customer;
    private List<Video> videos;
    private int night;
    private int day;
    private int money;

    Rental(Customer customer, List<Video> videos, int night, int day, int money) {
        this.customer = customer;
        this.videos = videos;
        this.night = night;
        this.day = day;
        this.money = money;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public List<Video> getVideos() {
        return this.videos;
    }

    public int getDay() {
        return this.day;
    }

    public void display() {
        System.out.print("Videos: ");
        for (Video video : this.videos)
            System.out.print(video.getName() + ", ");

        System.out.print('\t');
        System.out.print("Customer: " + this.customer.getName() + ", \t");
        System.out.print("Days: " + this.night + ", \t");
        System.out.println("Money: " + this.money);
    }
}
