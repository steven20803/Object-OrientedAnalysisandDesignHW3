import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Breezy extends Customer {
    Breezy(String name){
        super(name);
    }
    // public Map<String, Integer> tryRent(){
    //     Map<String, Integer> rent = new HashMap<>();
    //     Random random = new Random();
    //     int video = random.nextInt(2) + 1;
    //     rent.put("video", video);
    //     int night = random.nextInt(2) + 1;
    //     rent.put("night", night);
    //     return rent;
    // }

    public int getNumRent(int storeVideo){
        Random random = new Random();
        if(maxVideo - super.getNumVideo() == 1 || storeVideo == 1){
            return 1;
        }

        else{
            return random.nextInt(2) + 1;
        }
    }

    public int getNight(){
        Random random = new Random();
        return random.nextInt(2) + 1;
    }

    public boolean isHoarder(){
        return false;
    }

    // public Rental createRental(List<Video> videos){
    //     Random random = new Random();
    //     int numRental;
    //     int numVideo = super.getNumVideo();
    //     int night = random.nextInt(2) + 1;
    //     if(maxVideo - numVideo == 1){
    //         numRental = 1;
    //     }

    //     else{
    //         numRental = random.nextInt(2) + 1;
    //     }

    //     List<Video> selectedVideos = videos.subList(0, numRental);
    //     super.setNumVideo(numVideo + numRental);
    //     return new Rental(this, selectedVideos, night);
    // }
}
