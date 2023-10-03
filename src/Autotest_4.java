import java.util.Collections;
import java.util.LinkedList;
public class Autotest_4 {
    public static void main(String[] args) {
        LinkedList<Object> ll = new LinkedList<>();
        if (args.length != 4) {
            ll.add(1);
            ll.add("One");
            ll.add(2);
            ll.add("Two");
        } else {
            ll.add(Integer.parseInt(args[0]));
            ll.add(args[1]);
            ll.add(Integer.parseInt(args[2]));
            ll.add(args[3]);
        }
        LLTasks answer = new LLTasks();
        System.out.println(ll);
        LinkedList<Object> reversedList = answer.revert(ll);
        System.out.println(reversedList);

    }
}


class LLTasks {
    public static LinkedList<Object> revert(LinkedList<Object> ll) {
        Collections.reverse(ll);
        return ll;


    }


}
