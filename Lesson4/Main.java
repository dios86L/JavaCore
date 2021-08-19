package Lesson4;

import java.util.*;

public class Main {
    public static void main (String[] args){
        List<String> words = new ArrayList<>(Arrays.asList("кот","собака","суслик","жираф","кот","свинья","собака","утка","слон",
                "собака","слон","кот","мышь","суслик","жираф","крот","свинья","собака","слон",
                "лошадь"));

        printWithoutDuplicates(words);
        countDuplicates(words);
        testPhoneBook();
    }

    public static void printWithoutDuplicates(List<String> input){
        Set<String> inputSet = new HashSet<>(input);
        System.out.println(inputSet);
    }

    public static void countDuplicates (List<String> input){
        Set<String> inputSet = new HashSet<>(input);
        for (String word : inputSet){
            int count = 0;
            for (String inner : input){
               if (word.equals(inner)) {
                   count++;
               }
            }
            System.out.printf("%s : %d\n", word, count);
        }
    }

    public static void testPhoneBook(){
        PhoneBook.add("Иванов", "+7921 3456879");
        PhoneBook.add("Петров", "+7911 344587Э");
        PhoneBook.add("сидоров", "+7951 3433549");
        PhoneBook.add("Гоша", "+7963 5456832");
        PhoneBook.add("Жорик", "+7909 3456888");
        PhoneBook.add("Вынос мозга", "+7934 3457675");
        PhoneBook.add("Босс", "+7333 3467479");
        PhoneBook.add("Вася", "+7911 2456833");
        PhoneBook.add("Иванов К", "+7111 2256847");
        PhoneBook.add("Жук", "+7921 1356856");
        PhoneBook.add("Петрович", "+7921 3456432");
        PhoneBook.add("Саня", "+7900 3556844");
        PhoneBook.add("Подруга", "+7963 1156229");
        PhoneBook.add("Ещё подруга", "+7901 3116856");
        PhoneBook.add("Близкая подруга", "+7900 3456879");
        PhoneBook.add("Родня", "+7921 1111111");

        PhoneBook.get("Иванов");
        PhoneBook.get("Родня");
        PhoneBook.get("Подруга");
        PhoneBook.get("Саня");
        PhoneBook.get("Босс");


    }
}
