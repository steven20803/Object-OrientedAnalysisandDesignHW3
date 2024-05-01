import java.util.List;
import java.util.Map;

abstract public class Customer {
    public static int maxVideo = 3;
    private String name;
    private int numVideo;

    public Customer(String name){
        this.name = name;
        this.numVideo = 0;
    }

    abstract public int getNumRent(int storeVideo);
    abstract public int getNight();
    abstract public boolean isHoarder();

    public String getName(){
        return this.name;
    }

    protected int getNumVideo(){
        return this.numVideo;
    }

    protected void setNumVideo(int numVideo){
        this.numVideo = numVideo;
    }
    // abstract public Map<String, Integer> tryRent();
}
