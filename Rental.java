import java.util.List;

public class Rental {
    private List<Video> videos;
    private int night;

    Rental(List<Video> vidoes, int night){
        this.videos = videos;
        this.night = night;
    }
}
