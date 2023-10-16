//Реализовать стэк с помощью массива.
//Нужно реализовать методы:
//size(), empty(), push() толкает, peek() возвращает элемент на вершине, pop() возвращает и удаляет элемент на вершине.


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        GBStack gbStack = new GBStack();
        System.out.println(gbStack.empty());
        gbStack.push(1)
                .push(5)
                .push(3)
                .push(10);
        System.out.println(gbStack);
        System.out.println(gbStack.peek());
        System.out.println(gbStack.pop());
        System.out.println(gbStack.pop());
        System.out.println(gbStack.size());
        System.out.println(gbStack.empty());


    }
}

//Напишите функцию printPrimeNums, которая выведет на экран все простые числа в промежутке от 1 до 1000,
// каждое на новой строке.
/*
        System.out.println("Enter n");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = 0;
        for (int i = 2; i < n + 1; i++) {
        for (int j = 2; j < i; j++) {
        if (i % j == 0) {
        k++;
        if (k == 1) {
        break;
        }
        }
        }
        if (k == 0) {
        System.out.println(i);;
        } else {
        k = 0;
        }

 */
// 2 variant
/* boolean isPrime;
        for(int i = 1; i < 1000; i++) {
        isPrime = i == 1;
        for(int j = 2; j < 1000; j++) {
        if (i >= j && i % j == 0) {
        if(j == i) {
        isPrime = true;
        }
        break;
        }
        }
        if(isPrime) System.out.println(i);
        }
       }*/