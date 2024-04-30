import java.util.Map;

abstract public class Customer {
    public static int maxVideo = 3;
    private int numVideo;

    public Customer(){
        this.numVideo = 0;
    }

    public int getNumVideo(){
        return this.numVideo;
    }
    abstract public Map<String, Integer> tryRent();
}
