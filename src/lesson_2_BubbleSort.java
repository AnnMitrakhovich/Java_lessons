import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;
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

            }
        }
    }

