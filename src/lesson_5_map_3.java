/*Написать программу, определяющую правильность расстановки скобок в выражении.
        Пример 1: a+(d*3) - истина
        Пример 2: [a+(1*3) - ложь
        Пример 3: [6+(3*3)] - истина
        Пример 4: {a}[+]{(d*3)} - истина
        Пример 5: <{a}+{(d*3)}> - истина
        Пример 6: {a+]}{(d*3)} - ложь */

import java.util.HashMap;
import java.util.Map;

public class lesson_5_map_3 {
    public static void main(String[] args) {
        bracks("<{a}+{(d*3)}>");

    }


    public static boolean bracks (String str) {
        //char[] openBracks = {'(','[','{','<'};
        //char[] closeBracks = {')',']','}','>'};
        char[] strArr = str.toCharArray();
        Map<Character,Integer> bracks = new HashMap<>();
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        bracks.put('(', count);
        bracks.put('[',count1);
        bracks.put('{',count2);
        bracks.put('<',count3);
        for (char elements: strArr) {
            if (bracks.get(elements) != null) {
                bracks.put(elements,count++);
            }

        }
        System.out.println(bracks);
        return true;
    }
}
//  public static boolean equals(String str) {
//        char[] result = str.toCharArray();
//        int count = 1;
////        Map<Character, Integer> bracks = new HashMap<>();
//        Map<Character, Character> mapping = new HashMap<>();
//        Deque<Character> res = new ArrayDeque<>();
//        mapping.put('{', '}');
//        mapping.put('[', ']');
//        mapping.put('(', ')');
//        mapping.put('<', '>');
//
//        for(char element : result){
//
//            if(mapping.containsKey(element)){
//                res.push(element);
//            } else if (mapping.containsValue(element) ){
//                if(res.isEmpty()){
//                    return false;
//                }
//                res.remove();
//            }
//
//        }
//
//    }
//}