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

import java.io.IOException;
import java.util.*;

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
                displaySize, ram, storageName, storage, processor, os, color);
    }

    public int hashCode() {
        return (int) (this.displaySize + this.ram + this.storageName.hashCode() + this.storage + this.processor.hashCode() + this.os.hashCode() + this.color.hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Laptop laptop = (Laptop) obj;
        return displaySize == laptop.displaySize &&
                ram == laptop.ram &&
                storage == laptop.storage &&
                storageName.equals(laptop.storageName) &&
                processor.equals(laptop.processor) &&
                os.equals(laptop.os) &&
                color.equals(laptop.color);
    }

    public static Map<Integer, String> addFilter() {
        Map<Integer, String> filter = new HashMap<>();
        filter.put(1, "разрешение экрана от");
        filter.put(2, "по объему ОЗУ от");
        filter.put(3, "по размеру ЖД от");
        filter.put(4, "по ОС");
        return filter;
    }

    public static Set<Laptop> filterData(Set<Laptop> laptop, Map<String, String> choiceMap) throws IOException {
        for (Map.Entry<String, String> entry : choiceMap.entrySet()) {
            String key = entry.getKey();
            switch (key) {
                case "display":
                    for (Laptop item : laptop) {
                        if (item.displaySize < Double.parseDouble(choiceMap.get(key))) {
                            laptop.remove(item);
                            choiceMap.remove(key);
                            break;
                        }
                    }
                case "RAM":
                    if (choiceMap.get(key) != null) {
                        for (Laptop item : laptop) {
                            if (item.ram < Integer.parseInt(choiceMap.get(key))) {
                                laptop.remove(item);
                                choiceMap.remove(key);
                                break;
                            }
                        }
                    } else {
                        break;

                    }
                case "Storage":
                    if (choiceMap.get(key) != null) {
                        for (Laptop item : laptop) {
                            if (item.storage < Integer.parseInt(choiceMap.get(key))) {
                                laptop.remove(item);
                                choiceMap.remove(key);
                                break;
                            }
                        }
                    } else {
                        break;

                    }
                case "OS":
                    for (Laptop item : laptop) {
                        if (item.os != choiceMap.get(key)) {
                            laptop.remove(item);
                            choiceMap.remove(key);
                            break;
                        }
                    }
                default:
                    break;
            }
        }
        return laptop;
    }


    public static Map<String, String> choice(int n, Set<String> choiceOs, Set<Double> choiceDisplay,
                                             Set<Integer> choiceRam, Set<Integer> choiceStorage, Map<String, String> choiceMap) {
        Scanner sc = new Scanner(System.in);
        String answer = "";
        if (n == 1) {
            System.out.println("Введите минимальное необходимое разрешение: " + choiceDisplay);
            if (sc.hasNext()) {
                answer = sc.nextLine();
                choiceMap.put("display", answer);
            } else {
                System.out.println("введите число из предложенных вариантов");
            }
        } else if (n == 2) {
            System.out.println("Введите минимальный объем ОЗУ: " + choiceRam);
            if (sc.hasNext()) {
                answer = sc.nextLine();
                choiceMap.put("RAM", answer);
            } else {
                System.out.println("введите число");
            }
        } else if (n == 3) {
            System.out.println("Введите минимальный объем ЖД: " + choiceStorage);
            if (sc.hasNext()) {
                answer = sc.nextLine();
                choiceMap.put("Storage", answer);
            } else {
                System.out.println("введите число");
            }
        } else if (n == 4) {
            System.out.println("Выберите ОС: " + choiceOs);
            if (sc.hasNext()) {
                answer = sc.nextLine();
                choiceMap.put("OS", answer);
            } else {
                System.out.println("сделайте выбор");
            }
        } else {
            System.out.println("такого фильтра не существует");
        }
        return choiceMap;
    }

    public static void main(String[] args) throws IOException {
        Laptop laptop1 = new Laptop(12.5, 8, 256, "HDD", "Intel Core", "Windows", "black");
        Laptop laptop6 = new Laptop(12.5, 8, 256, "HDD", "Intel Core", "Windows", "black");
        Laptop laptop2 = new Laptop(12.5, 16, 256, "HDD", "AMD Ryzen", "Windows", "silver");
        Laptop laptop3 = new Laptop(13.5, 8, 256, "HDD", "Intel Core", "Windows", "silver");
        Laptop laptop4 = new Laptop(13.5, 16, 500, "SDD", "Intel Core", "Windows", "black");
        Laptop laptop7 = new Laptop(13.5, 16, 500, "SDD", "Intel Core", "Windows", "black");
        Laptop laptop5 = new Laptop(15, 32, 256, "SDD", "Intel i5", "macOS", "black");
        Laptop laptop8 = new Laptop(15, 32, 256, "SDD", "Intel i5", "macOS", "black");
        Set<Laptop> data = new HashSet<>(List.of(laptop1, laptop2, laptop3, laptop4, laptop5, laptop6, laptop7, laptop8));
        Set<Double> choiceDisplay = new HashSet<>(List.of(laptop1.displaySize, laptop2.displaySize, laptop3.displaySize,
                laptop4.displaySize, laptop5.displaySize, laptop6.displaySize, laptop7.displaySize, laptop8.displaySize));
        Set<Integer> choiceRam = new HashSet<>(List.of(laptop1.ram, laptop2.ram, laptop3.ram, laptop4.ram, laptop5.ram,
                laptop6.ram, laptop7.ram, laptop8.ram));
        Set<Integer> choiceStorage = new HashSet<>(List.of(laptop1.storage, laptop2.storage, laptop3.storage, laptop4.storage, laptop5.storage,
                laptop6.storage, laptop7.storage, laptop8.storage));
        Set<String> choiceOs = new HashSet<>(List.of(laptop1.os, laptop2.os, laptop3.os, laptop4.os, laptop5.os, laptop6.os, laptop7.os, laptop8.os));
        System.out.println(data);
        System.out.println("Выберите параметр(только цифру) фильтрации из списка: " + addFilter() + " по окончании нажмите любую букву");
        Scanner scanner = new Scanner(System.in);
        Map<String, String> resChoiceMap = new HashMap<>();
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            resChoiceMap.putAll(choice(n, choiceOs, choiceDisplay, choiceRam, choiceStorage, resChoiceMap));
        }
        scanner.close();
        System.out.println(resChoiceMap);
        Set<Laptop> result = filterData(data, resChoiceMap);
        System.out.println(result);

    }

}
