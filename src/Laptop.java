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

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    public String toString() {
        return String.format("Разрешение экрана: %f, ОЗУ: %d,ЖД: %s, %d, процессор: %s, ОС:%s, цвет: %s\n",
                displaySize,ram,storageName,storage,processor,os,color);
    }
    public int hashCode() {
        return (int) (this.displaySize + this.ram + this.storageName.hashCode() + this.storage + this.processor.hashCode() + this.os.hashCode() + this.color.hashCode());
    }
    public boolean equals(Object laptop) {
        Laptop newLaptop = (Laptop) laptop;
        return this.storageName.equals(newLaptop.storageName) && this.displaySize == newLaptop.displaySize &&
                this.ram == newLaptop.ram && this.storage == newLaptop.storage &&
                this.processor.equals(newLaptop.processor) && this.os.equals(newLaptop.os) &&
                this.color.equals(newLaptop.color);
    }

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop(12.5, 8, 256, "HDD", "Intel Core","Windows 10", "black");
        Laptop laptop6 = new Laptop(12.5, 8, 256, "HDD", "Intel Core","Windows 10", "black");
        Laptop laptop2 = new Laptop(12.5, 16, 256, "HDD", "AMD Ryzen","Windows 10", "silver");
        Laptop laptop3 = new Laptop(13.5, 8, 256, "HDD", "Intel Core","Windows 10", "silver");
        Laptop laptop4 = new Laptop(13.5, 16, 500, "SDD", "Intel Core","Windows 10", "black");
        Laptop laptop7 = new Laptop(13.5, 16, 500, "SDD", "Intel Core","Windows 10", "black");
        Laptop laptop5 = new Laptop(15, 32, 256, "SDD", "Intel i5","macOS", "black");
        Laptop laptop8 = new Laptop(15, 32, 256, "SDD", "Intel i5","macOS", "black");
        Set<Laptop> data = new HashSet<>(List.of(laptop1,laptop2,laptop3,laptop4,laptop5,laptop6,laptop7,laptop8));
        System.out.println(data);

    }


}
