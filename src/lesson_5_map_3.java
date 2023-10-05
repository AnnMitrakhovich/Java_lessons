/*Написать программу, определяющую правильность расстановки скобок в выражении.
        Пример 1: a+(d*3) - истина
        Пример 2: [a+(1*3) - ложь
        Пример 3: [6+(3*3)] - истина
        Пример 4: {a}[+]{(d*3)} - истина
        Пример 5: <{a}+{(d*3)}> - истина
        Пример 6: {a+]}{(d*3)} - ложь */

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class lesson_5_map_3 {
    public static void main(String[] args) {

        System.out.println(checkBracks("<{a+{(d*3)}>"));

    }

    public static boolean checkBracks(String str) {
        char[] strArr = str.toCharArray();
        Map<Character, Character> mapping = new HashMap<>();
        Deque<Character> res = new ArrayDeque<>();
        mapping.put('{', '}');
        mapping.put('[', ']');
        mapping.put('(', ')');
        mapping.put('<', '>');
        for (char elements : strArr) {
            if (mapping.containsKey(elements)) {
                res.add(elements);
                continue;

            } else if (mapping.containsValue(elements)) {
                if (res.isEmpty()) {
                    return false;
                } else {
                    res.removeLast();
                }
            }
        }
        return res.isEmpty();
    }
}

