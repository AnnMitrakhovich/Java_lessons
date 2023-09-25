// Дано четное число N (>0) и строки c1 и c2,
// которые следует учитывать как 1 символ.
// Написать метод, который вернет строку длины N*2,
// которая состоит из чередующихся последовательностей c1 и c2, начиная с c1.
public class lesson_2_API {
    public static void main(String[] args) {
        System.out.println(getRepeatStr(6));

    }

    public static String getRepeatStr(int n) {
        String c1 = "c1";
        String c2 = "c2";
        return (c1 + c2).repeat(n);
    }
}
