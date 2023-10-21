import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
а) информационной системой ветеринарной клиники
б) архивом выставки котов
в) информационной системой Театра кошек Ю. Д. Куклачёва
Можно записать в текстовом виде, не обязательно реализовывать в java.
1. Реализуйте 1 из вариантов класса Cat из предыдущего задания,
можно использовать не все придуманные поля и методы. Создайте несколько экземпляров этого класса,
выведите их в консоль.
2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась его кличка, цвет и возраст
(или другие параметры на ваше усмотрение).
 */
public class Cat {
    String name;
    double weight;
    double age;
    String breed;
    String role;
    String sex;
    String character;
    int box;
    String food;

    public Cat(String name, double age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;

    }
    public String toString() {
        return String.format("name = %s, age = %f weight = %f \n" , name, age, weight);
    }
    public boolean equals(Object cat) {
        Cat newcat = (Cat) cat;
        return this.name.equals(newcat.name) && this.age == newcat.age && this.weight == newcat.weight;
    }
    public int hashCode() {
        return (int) (this.name.hashCode() + this.age + this.weight);
    }
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 3, 15.2);
        Cat cat4 = new Cat("Barsik", 3, 15.2);
        Cat cat2 = new Cat("Baks", 1, 5.2);
        Cat cat3 = new Cat("Gusik", 4, 6.2);
        Cat cat5 = new Cat("Asik", 5, 15.2);
        Set<Cat> data = new HashSet<>(List.of(cat, cat2, cat3, cat4, cat5));
        System.out.println(data);
    }
}
