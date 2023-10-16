//Реализовать консольное приложение, которое:
//Принимает от пользователя строку вида text:num
//Нужно сделать “сплит” строки по : , сохранить text в связный список на позицию num.
//Если введено print:num, выводит строку из позиции num в связном списке и удаляет её из списка.
import java.util.ArrayList;
import java.util.Scanner;

public class lesson_4_arrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            System.out.println("Enter data: ");
            String in = prompt();
            String[] arr = in.split(":");
            String name = arr[0];
            int index = Integer.parseInt(arr[1]);
            if (!name.equals("print")) {
                if(list.size()<index){
                    for (int i = 0; i <= index; i++) {
                        list.add(null);
                    }
                }
                list.add(index, name);
            } else {
                System.out.println(list.get(index));
            }
        }
    }

    public static String prompt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}
