/* Даны 2 строки, написать метод, который вернет true, если эти строки являются
изоморфными и false, если нет. Строки изоморфны, если одну букву в первом слове
можно заменить на некоторую букву во втором слове, при этом
повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением
порядка следования. (Например, add - egg изоморфны)
буква может не меняться, а остаться такой же. (Например, note - code)
Пример 1:
Input: s = "foo", t = "bar"
Output: false
Пример 2:
Input: s = "paper", t = "title"
Output: true */

import java.util.HashMap;
import java.util.Map;
public class lesson_5_map_2 {



    public static void main(String[] args) {
        String s = "kaper", t = "kikle";
        System.out.println(searchLitter(s, t));
    }

    public static boolean searchLitter(String str, String str2) {
        if (str.length() != str2.length()) {
            return false;
        }
        char[] strArr = str.toCharArray();
        char[] strArr2 = str2.toCharArray();
        Map<Character, Character> result = new HashMap<>();
        int count = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (result.get(strArr[i]) != null) {
                if (!result.get(strArr[i]).equals(strArr2[i])) {
                    return false;
                }

            } else {
                result.put(strArr[i], strArr2[i]);
            }
        }
        return true;
    }
}
