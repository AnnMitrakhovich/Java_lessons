/* Задание №0
1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
Распечатайте содержимое данного множества.
2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
Распечатайте содержимое данного множества.
3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
Распечатайте содержимое данного множества.
*/

import java.util.*;

public class lesson_6_set_1 {
    public static void main(String[] args) {
        HashSet data = new HashSet(List.of(4, 1, 2,'a', 5, 3, 2, 4, 5, 6, 3));
        System.out.println(data);
        LinkedHashSet data2 = new LinkedHashSet(List.of(4, 1, 2,'a', 5, 3, 2, 4, 5, 6, 3));
        System.out.println(data2);
        TreeSet data3 = new TreeSet(List.of(4, 1, 2,'a', 5, 3, 2, 4, 5, 6, 3));
        System.out.println(data3);




    }
}
