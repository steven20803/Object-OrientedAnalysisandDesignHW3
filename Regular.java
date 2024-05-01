import java.util.Random;

public class Regular extends Customer {
    Regular(String name) {
        super(name);
    }

    public int getNumRent(int storeVideo) {
        Random random = new Random();
        int maxRent = maxVideo - super.getNumVideo();
        if (storeVideo > maxRent)
            return random.nextInt(maxRent) + 1;

        else
            return random.nextInt(storeVideo) + 1;
    }

    public int getNight() {
        Random random = new Random();
        return random.nextInt(3) + 3;
    }

    public boolean isHoarder() {
        return false;
    }
}
