//Напишите метод, который принимает на вход строку (String) и
// определяет является ли строка палиндромом (возвращает boolean значение).
public class lesson_2_API_palindrom {
    public static void main(String[] args) {
        System.out.println(isPolindrom("abba"));

    }

    public static boolean isPolindrom(String str) {
        StringBuilder str_builder = new StringBuilder();
        String reverse = str_builder.reverse().toString();
        return str.equals(reverse);


    }
}
