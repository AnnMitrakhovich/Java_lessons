/* Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
        123456 Иванов
        321456 Васильев
        234561 Петрова
        234432 Иванов
        654321 Петрова
        345678 Иванов
        Вывести данные по сотрудникам с фамилией Иванов. */

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class lesson_5_map_1 {
    public static void main(String[] args) {
        HashMap<Integer, String> phonebook = new HashMap<>();
        phonebook.put(123456, "Иванов");
        phonebook.put(321456, "Васильев");
        phonebook.put(234561, "Петрова");
        phonebook.put(234432, "Иванов");
        phonebook.put(654321, "Петрова");
        phonebook.put(345678, "Иванов");
        System.out.println(phonebook.toString());
        for (Entry line: phonebook.entrySet()) {
            if (line.getValue().equals("Иванов")) {
                System.out.println(line.getKey() + " " + line.getValue());
            }
        }


    }

}
