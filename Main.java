import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import java.util.Iterator;

public class Main {
    public static class Tst{
        public int i;
        Tst(int i){
            this.i = i;
        }
    }
    public static void main(String[] args) {
        

        // List<Tst> tsts = new ArrayList<>();
        // tsts.add(new Tst(0));
        // tsts.add(new Tst(1));
        // tsts.add(new Tst(1));
        // tsts.add(new Tst(2));

        // Iterator<Tst> iterator0 = tsts.iterator();
        // while(iterator0.hasNext()){
        //     Tst tst = iterator0.next();
        //     System.out.println("Iteration " + tst.i);
        //     if(tst.i == 1)
        //         iterator0.remove();
        // }

        // for(Tst tst : tsts){
        //     System.out.println("Result: " + tst.i);
        // }

        List<Customer> customers = new ArrayList<>();
        customers.add(new Breezy("Emily"));
        customers.add(new Breezy("Lucas"));
        customers.add(new Breezy("Grace"));
        customers.add(new Breezy("Nathan"));
        customers.add(new Hoarder("Isabella"));
        customers.add(new Hoarder("Ethan"));
        customers.add(new Hoarder("Olivia"));
        customers.add(new Regular("Jacob"));
        customers.add(new Regular("Ava"));
        customers.add(new Regular("Liam"));

        Store store = new Store();
        Random random = new Random();

        for(int i = 0; i < 35; i++){
            Collections.shuffle(customers);
            store.shuffleVideo();

            int numTry = random.nextInt(customers.size()) + 1;
            for(int j = 0; j < numTry; j++){
                int numVideo = store.getNumVideo();
                if(numVideo == 0)
                    break;

                if(customers.get(j).isHoarder() && numVideo < 3)
                    continue;

                store.rent(customers.get(j), i);
            }

            List<Rental> rentals = store.getRentals();
            for(Rental rental : rentals){
                if(rental.getDay() == i){
                    rental.display();
                    store.receive(rental);
                }
            }
        }

        store.display();
        System.out.print('\n');
        store.displayRental();

        // public void receive(int day){
        //     Iterator<Rental> iterator = rentals.iterator();
        //     while (iterator.hasNext()) {
        //         Rental rental = iterator.next();
        //         if(day == rental.getDay()){
        //             List<Video> videos = rental.getVideos();
        //             Customer customer = rental.getCustomer();
        //             this.videos.addAll(videos);
        //             customer.setNumVideo(customer.getNumVideo() - videos.size());
        //             iterator.remove(); // 使用迭代器的 remove 方法安全删除
        //         }
        //     }
        // }
    }
}
