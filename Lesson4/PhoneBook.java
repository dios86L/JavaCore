package Lesson4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private static final Map<String, List<String>> phoneBook = new HashMap<>();

    public static void add(String name, String phoneToAdd) {
        if (phoneBook.get(name) != null){
            List<String> phones = new ArrayList<>(phoneBook.get(name));
            phones.addAll(List.of(phoneToAdd));
            phoneBook.put(name,phones);
        }else {
            phoneBook.put(name,List.of(phoneToAdd));
        }
    }

    public static void get(String name){
        System.out.printf("%s : %s\n",name,phoneBook.get(name));
    }

}
