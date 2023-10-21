/*
1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите
процент уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
Для вычисления процента используйте формулу:
процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class lesson_6_set_2 {
    public static void main(String[] args) {
        int[] resArr = addArray();
        System.out.println(Arrays.toString(resArr));
        percent(createSet(resArr), resArr);


    }

    public static int[] addArray() {
        Random random = new Random(0);
        int[] data = new int[750];
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(40);
        }
        return data;
    }
    public static Set<Integer> createSet (int[] data) {
        Set<Integer> setData = new HashSet<>();
        for (int i = 0; i < data.length; i++) {
            setData.add(data[i]);
        }
        return setData;
    }
    public static void percent (Set<Integer> setData, int[] data) {
        double res = (double)(setData.size() * 100 )/ data.length;
        System.out.println(res);

    }


}
