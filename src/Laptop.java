/*Задание
Подумать над структурой класса Ноутбук (Laptop) для магазина техники - выделить поля и методы.
Реализовать в java. Создать множество ноутбуков Set<Laptop>.
(добиться чтобы во множестве не было одинаковых ноутбуков)
(*) Написать метод, который будет запрашивать у пользователя критерий (или критерии)
фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map.
Например: “Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры
фильтрации можно также в Map. Отфильтровать ноутбуки их первоначального множества и
вывести проходящие по условиям.*/

public class Laptop {
    double displaySize;
    int ram;
    int storage;
    String storageName;
    String processor;
    String os;
    String color;
    public Laptop(double displaySize, int ram, int storage, String storageName, String processor,
                  String os, String color) {
        this.displaySize = displaySize;
        this.ram = ram;
        this.storage = storage;
        this.storageName = storageName;
        this.processor = processor;
        this.os = os;
        this.color = color;

    }




}
