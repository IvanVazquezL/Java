package Lists;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> emptyList = List.of(); // 0 elements
        List<String> names = List.of("Larry", "Kenny", "Sabrina"); // 3 elements
        List<Integer> numbers = List.of(0, 1, 1, 2, 3, 5, 8, 13);  // 8 elements

        List<String> daysOfWeek = List.of(
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        );

        System.out.println(daysOfWeek.size()); // 7
        System.out.println(daysOfWeek.get(1)); // Tuesday
        System.out.println(daysOfWeek.indexOf("Sunday")); // 6

        List<String> weekDays = daysOfWeek.subList(0, 5);
        System.out.println(weekDays); // [Monday, Tuesday, Wednesday, Thursday, Friday]

        List<Integer> oneToFive = Arrays.asList(1, 2, 3, 4, 5); // fixed-size list
        oneToFive = Collections.unmodifiableList(oneToFive); // unmodifiable list

        List<Integer> numbersList = new ArrayList<>();

        numbers.add(15);
        numbers.add(10);
        numbers.add(20);

        System.out.println(numbers); // [15, 10, 20]

        numbers.set(0, 30); // no exceptions here

        System.out.println(numbers); // [30, 10, 20]

        List<String> immutableList = List.of("one", "two", "three");
        List<String> mutableList = new ArrayList<>(immutableList);

        List<Integer> numbersLinkedList = new LinkedList<>();

        numbersLinkedList.add(10);
        numbersLinkedList.add(20);
        numbersLinkedList.add(30);

        System.out.println(numbersLinkedList); // [10, 20, 30]

        Objects.equals(List.of(1, 2, 3), List.of(1, 2, 3));    // true
        Objects.equals(List.of(1, 2, 3), List.of(1, 3, 2));    // false
        Objects.equals(List.of(1, 2, 3), List.of(1, 2, 3, 1)); // false

        List<Integer> numberss = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        Objects.equals(numberss, List.of(1, 2, 3)); // true

        Collection<String> languages = new ArrayList<>();

        languages.add("English");
        languages.add("Deutsch");
        languages.add("Français");

        System.out.println(languages.size()); // 3

        languages.forEach(System.out::println); // with method reference
        languages.forEach(elem -> System.out.println(elem)); // with lambda expression

        languages.removeIf(lang -> lang.startsWith("E")); // it removes English


    }
}
