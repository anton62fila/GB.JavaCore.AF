/**
 * JavaCore.HW4
 * @ author Anton Filatov
 * @ version 06.12.2022
 */
/**
 * 1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
 * Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
 * Посчитать, сколько раз встречается каждое слово.
 * 2. Написать простой класс «Телефонный Справочник», который хранит в себе список фамилий и телефонных номеров.
 * В этот телефонный справочник с помощью метода add() можно добавлять записи,
 * а с помощью метода get() искать номер телефона по фамилии.
 * Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
 * тогда при запросе такой фамилии должны выводиться все телефоны.
 */

package lesson4;

import java.util.*;

public class HomeWork {

//task 1

    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "Dog", "Cat", "Mouse", "Cow", "Horse",
                "Goat", "Dog", "Horse", "Cat", "Dog",
                "Cow", "Sheep", "Mouse", "Sheep", "Cat",
                "Pig", "Cat", "Chicken", "Dog", "Duck"
        );

        Set<String> unique = new HashSet<String>(words);

        System.out.println("Первоначальный массив:");
        System.out.println(words.toString());
        System.out.println("Уникальные слова:");
        System.out.println(unique.toString());
        System.out.println("Частота встречаемости слов:");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }

//task 2

    PhoneBook phonebook = new PhoneBook();
        System.out.println("-----------------");
        System.out.println("Наполняем справочник:");
        phonebook.add("Ivanov","123");
        phonebook.add("Ivanov","1234");
        phonebook.add("Petrov","456");
        phonebook.add("Sidorov","789");
        phonebook.add("Ivanov","12345");
        System.out.println("Получаем номера:");
        System.out.println("Ivanov");
        System.out.println(phonebook.get("Ivanov"));
        System.out.println("Petrov");
        System.out.println(phonebook.get("Petrov"));
        System.out.println("Sidorov");
        System.out.println(phonebook.get("Sidorov"));
        System.out.println("Случай отсутствия записи:");
        System.out.println("Orlov");
        System.out.println(phonebook.get("Orlov"));
        System.out.println("Пробуем записать существующий номер:");
        phonebook.add("Ivanov","123");
        System.out.println("Ivanov");
        System.out.println(phonebook.get("Ivanov"));
    }
}

