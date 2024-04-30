import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Breezy extends Customer {
    public Map<String, Integer> tryRent(){
        Map<String, Integer> rent = new HashMap<>();
        Random random = new Random();
        int video = random.nextInt(2) + 1;
        rent.put("video", video);
        int night = random.nextInt(2) + 1;
        rent.put("night", night);
        return rent;
    }
}
