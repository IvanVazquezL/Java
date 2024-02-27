package Generics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GenericType<Integer> obj1 = new GenericType<Integer>(10);
        GenericType<String> obj2 = new GenericType<String>("abc");
        var obj3 = new GenericType<>(true);

        System.out.println(obj1.get());
        System.out.println(obj2.get());
        System.out.println(obj3.get());

        Integer number = obj1.get(); // 10
        String string = obj2.get();  // "abc"

        System.out.println(obj1.set(20));    // prints the number 20
        System.out.println(obj2.set("def")); // prints the string "def"

        // Create an instance of the Pair class with String and Integer types
        Pair<String, Integer> pair = new Pair<>("Hello", 123);

        // Get and print the values from the pair
        String first = pair.getFirst();
        Integer second = pair.getSecond();
        System.out.println("First: " + first);
        System.out.println("Second: " + second);

        var stringArray = new ImmutableArray<>(new String[] {"item1", "item2", "item3"});

        for (int i = 0; i < stringArray.length(); i++) {
            System.out.print(stringArray.get(i) + " ");
        }

        Scanner sc = new Scanner(System.in);
        Box box = new Box();

        if(sc.hasNextInt()) {
            int num = sc.nextInt();
            box.set(num);
            // your code here
        } else if (sc.hasNextFloat()) {
            float num = sc.nextFloat();
            box.set(num);
            // your code here
        } else {
            String str = sc.next();
            box.set(str);
            // your code here
        }

        System.out.println(box.get());
    }
}
