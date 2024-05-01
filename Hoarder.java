public class Hoarder extends Customer {
    Hoarder(String name) {
        super(name);
    }

    public int getNumRent(int storeVideo) {
        return 3;
    }

    public int getNight() {
        return 7;
    }

    public boolean isHoarder() {
        return true;
    }
}
