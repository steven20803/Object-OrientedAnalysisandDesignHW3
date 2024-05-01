import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Regular extends Customer {
    Regular(String name){
        super(name);
    }
    // public Map<String, Integer> tryRent(){
    //     Map<String, Integer> rent = new HashMap<>();
    //     Random random = new Random();
    //     int video = random.nextInt(3) + 1;
    //     rent.put("video", video);
    //     int night = random.nextInt(3) + 3;
    //     rent.put("night", night);
    //     return rent;
    // }

    public int getNumRent(int storeVideo){
        Random random = new Random();
        int maxRent = maxVideo - super.getNumVideo();
        if(storeVideo > maxRent)
            return random.nextInt(maxRent) + 1;

        else
            return random.nextInt(storeVideo) + 1;
    }

    public int getNight(){
        Random random = new Random();
        return random.nextInt(3) + 3;
    }

    public boolean isHoarder(){
        return false;
    }

    // public Rental createRental(List<Video> videos){
    //     Random random = new Random();
    //     int numVideo = super.getNumVideo();
    //     int night = random.nextInt(3) + 3;
    //     int maxRental = maxVideo - numVideo;
    //     int numRental = random.nextInt(maxRental) + 1;
    //     List<Video> selectedVideos = videos.subList(0, numRental);
    //     super.setNumVideo(numVideo + numRental);
    //     return new Rental(this, selectedVideos, night);
    // }
}
