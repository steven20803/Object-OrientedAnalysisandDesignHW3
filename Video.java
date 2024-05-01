abstract public class Video {
    private String name;
    private int price;

    Video(String name, int price){
        this.name = name;
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }

    public String getName(){
        return this.name;
    }
}
