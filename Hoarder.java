import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hoarder extends Customer {
    Hoarder(String name){
        super(name);
    }
    // public Map<String, Integer> tryRent(){
    //     Map<String, Integer> rent = new HashMap<>();
    //     rent.put("video", 3);
    //     rent.put("night", 7);
    //     return rent;
    // }

    public int getNumRent(int storeVideo){
        return 3;
    }

    public int getNight(){
        return 7;
    }

    public boolean isHoarder(){
        return true;
    }

    // public Rental createRental(List<Video> videos){
    //     List<Video> selectedVideos = videos.subList(0, 3);
    //     super.setNumVideo(3);
    //     return new Rental(this, selectedVideos, 7);
    // }
}
