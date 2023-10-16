/* Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
        123456 Иванов
        321456 Васильев
        234561 Петрова
        234432 Иванов
        654321 Петрова
        345678 Иванов
        Вывести данные по сотрудникам с фамилией Иванов. */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class lesson_5_map_1 {
    public static void main(String[] args) {
        String name1;
        String name2;
        int phone1;
        int phone2;

        if (args.length == 0) {
            name1 = "Ivanov";
            name2 = "Petrov";
            phone1 = 123456;
            phone2 = 654321;
        } else {
            name1 = args[0];
            name2 = args[1];
            phone1 = Integer.parseInt(args[2]);
            phone2 = Integer.parseInt(args[3]);
        }

        PhoneBook myPhoneBook = new PhoneBook();
        myPhoneBook.add(name1, phone1);
        myPhoneBook.add(name1, phone2);
        myPhoneBook.add(name2, phone2);
        System.out.println(myPhoneBook.toString());


        System.out.println(myPhoneBook.find(name1));
        System.out.println(PhoneBook.getPhoneBook());
        System.out.println(myPhoneBook.find("Me"));
    }
}

class PhoneBook {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();


    public void add(String name, Integer phoneNum) {
        ArrayList<Integer> contactList = new ArrayList<Integer>();
        if (phoneBook.containsKey(name)) {
            contactList = phoneBook.get(name);
            contactList.add(phoneNum);
            phoneBook.put(name, contactList);
        } else {
            contactList.add(phoneNum);
            phoneBook.put(name, contactList);
        }
    }


    public ArrayList<Integer> find(String name) {
        ArrayList<Integer> contactList = new ArrayList<Integer>();
        if (phoneBook.containsKey(name)) {
            contactList = phoneBook.get(name);
            return contactList;
        } else {
            return contactList;

        }

    }


    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
        HashMap<String, ArrayList<Integer>> phoneBook1 = phoneBook;
        return phoneBook1;
    }
}
