package lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {
    private HashMap<String, List<String>> book;

    public PhoneBook(){
        this.book = new HashMap<>();
    }

    public void add(String surname, String number){
        if(book.containsKey(surname)){
            List<String> numbers = book.get(surname);
            if(!numbers.contains(number)){
                numbers.add(number);
                System.out.println(String.format("Номер %s добавлен для фамилии %s", number, surname));
            } else {
                System.out.println(String.format("Номер %s уже существует для фамилии %s", number, surname));
            }
        } else {
            book.put(surname, new ArrayList<>(Arrays.asList(number)));
            System.out.println(String.format("Номер %s добавлен для фамилии %s", number, surname));
        }
    }

    public List<String> get(String surname){
        if(book.containsKey(surname)){
            return book.get(surname);
        } else {
            System.out.println(String.format("В справочнике нет записи для фамилии %s", surname));
            return new ArrayList<>();
        }
    }
}
