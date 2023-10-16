import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;
/*Реализуйте алгоритм сортировки пузырьком числового массива, 
результат после каждой итерации запишите в лог-файл.
Запишите свой код в методе sort класса BubbleSort. Метод sort принимает на вход один параметр:
int[] arr - числовой массив
После каждой итерации, ваш код должен делать запись в лог-файл 'log.txt' 
в формате год-месяц-день час:минуты {массив на данной итерации}.*/

public class lesson_2_BubbleSort {
    public static void main(String[] args) {
        int[] arr = {};
        arr = new int[]{9, 4, 8, 3, 1};
        BubbleSort ans = new BubbleSort();
        ans.sort(arr);
        try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static class BubbleSort {
        private static File log;
        private static FileWriter fileWriter;

        public static void sort(int[] mas) {
            int temp = mas[0];
            for (int i = mas.length - 1; i >= 1; i--) {
                for (int j = 0; j < i; j++) {
                    if (mas[j] > mas[j + 1]) {
                        temp = mas[j];
                        mas[j] = mas[j + 1];
                        mas[j + 1] = temp;
                    }

                }
            }

        }
    }
}

