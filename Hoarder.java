import java.util.HashMap;
import java.util.Map;

public class Hoarder extends Customer {
    public Map<String, Integer> tryRent(){
        Map<String, Integer> rent = new HashMap<>();
        rent.put("video", 3);
        rent.put("night", 7);
        return rent;
    }
}
