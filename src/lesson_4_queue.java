import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class lesson_4_queue {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        LinkedList<Integer> ll = new LinkedList<>();
        Random random = new Random();
        long starttime = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            arr.add(i);
        }
        long endtime = System.currentTimeMillis();
        System.out.println("Time LinkedList: " + (endtime - starttime));
        long starttime1 = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            ll.add(i);
        }
        long endtime1 = System.currentTimeMillis();
        System.out.println("Time arr: " + (endtime1 - starttime1));
        int count = 0;
        long starttime3 = System.currentTimeMillis();
        while (count != 1000) {
            arr.add(4000, random.nextInt());
            count++;
        }
        long endtime3 = System.currentTimeMillis();
        System.out.println("Time arr while: " + (endtime3 - starttime3));
        int count4 = 0;
        long starttime4 = System.currentTimeMillis();
        while (count4 != 1000) {
            ll.add(4000, random.nextInt());
            count4++;
        }
        long endtime4 = System.currentTimeMillis();
        System.out.println("Time linkedlist while: " + (endtime4 - starttime4));
    }
}
