// Написать метод, который переведет число из римского формата записи в арабский.
// Например, MMXXII = 2022
// I = 1; V = 5; X = 10; L = 50; C = 100; D = 500; M = 1000.

import java.util.HashMap;
import java.util.Map;

public class lesson_5_map_4 {
    public static void main(String[] args) {
        int res = romNums("MXXVX");
        System.out.println(res);

    }

    private static int romNums(String str) {
        char[] litter = str.toCharArray();
        Map<Character, Integer> romNums = new HashMap<>();
        romNums.put('I', 1);
        romNums.put('V', 5);
        romNums.put('X', 10);
        romNums.put('L', 50);
        romNums.put('C', 100);
        romNums.put('D', 500);
        romNums.put('M', 1000);
        int result = 0;
        int temp = 0;
        if (romNums.containsKey(litter[0])) {
            temp = romNums.get(litter[0]);
        }

        for (char c : litter) {
            if (romNums.containsKey(c)) {
                int first = romNums.get(c);
                int previous = temp;
                temp = first;
                if (previous >= first) {
                    result = result + first;
                } else {
                    result = result - previous + (first - previous);
                }
            } else {
                System.out.println("wrong litter");
            }
        }
        return result;
    }

}
