import java.util.Random;

public class Breezy extends Customer {
    Breezy(String name) {
        super(name);
    }

    public int getNumRent(int storeVideo) {
        Random random = new Random();
        if (maxVideo - super.getNumVideo() == 1 || storeVideo == 1) {
            return 1;
        }

        else {
            return random.nextInt(2) + 1;
        }
    }

    public int getNight() {
        Random random = new Random();
        return random.nextInt(2) + 1;
    }

    public boolean isHoarder() {
        return false;
    }
}
