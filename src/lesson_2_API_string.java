// Напишите метод, который сжимает строку.
// Пример: aaaabbbcdd → a4b3cd2




import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.SplittableRandom;

public class lesson_2_API_string {
    public static void main(String[] args) {
        System.out.println(reduceStr("aaaabbbcdd"));
        System.out.println(reduceStr("aaaabbbcddaaabbb"));
    }

    public static String reduceStr(String str) {
        String[] arr = str.split("");
        // char[] chars = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        List<String> tmp = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                tmp.add(arr[i]);
            } else {
                if (arr[i].equals(arr[i - 1])) {
                    tmp.add(arr[i]);
                } else {
                    stringBuilder.append(arr[i - 1]).append(tmp.size());
                    tmp.clear();
                    tmp.add(arr[i]);
                }
            }
            if (i == arr.length - 1) {
                stringBuilder.append(tmp.get(0)).append(tmp.size());
            }
        }
        return stringBuilder.toString();
    }
}