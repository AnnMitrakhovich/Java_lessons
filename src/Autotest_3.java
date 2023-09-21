import java.util.Scanner;

// Напишите класс Calculator, который будет выполнять математические операции (+, -, *, /)
// над двумя числами и возвращать результат. В классе должен быть метод calculate,
// который принимает оператор и значения аргументов и возвращает результат вычислений.
//
//При неверно переданном операторе, программа должна вывести сообщение об ошибке
// "Некорректный оператор: 'оператор'".
public class Autotest_3 {
    public static void main(String[] args) throws java.io.IOException{
        // Введите свое решение ниже
        System.out.println("Enter number 1");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("Enter number 2");
        int b = scan.nextInt();
        System.out.println("Enter operator");
        char op = (char) System.in.read();
        int result = 0;
        if (op == '+') {
            result = a + b;
        } else if (op == '-') {
            result = a - b;
        } else if (op == '*') {
            result = a * b;
        } else if (op == '/') {
            if (b == 0) {
                System.out.println("Change number 2");
            } else {
                result = a / b;
            }

        } else {
            System.out.println("Некорректный оператор: " + op);
        }
        System.out.println(result);


    }
}


/*
public static String calculate(char op, int a, int b) {
        Integer result;
        switch (op) {
            case '+' -> result = a + b;
            case '-' -> result = a - b;
            case '*' -> result = a * b;
            case '/' -> {if (b != 0) result = a / b; else {return "На ноль делить нельзя";}}
            default -> {return "Некорректный оператор: '" + op + "'" ;}
        }
        return result.toString();
    }
 */