package Lambda;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        //By a lambda expression (or just "a lambda"), we mean a function that isn't bound to its
        // name (an anonymous function) but can be assigned to a variable.

        //The expression has the type BiFunction<Integer, Integer, Boolean> which means,
        // that it takes two Integer values and returns a Boolean value.
        BiFunction<Integer, Integer, Boolean> isDivisible = (x, y) -> x % y == 0;
        System.out.println(isDivisible.apply(10, 5));

        // if it has only one argument "()" are optional
        Function<Integer, Integer> adder1 = x -> x + 1;

        // with type inference
        Function<Integer, Integer> mult2 = (Integer x) -> x * 2;

        // with multiple statements
        Function<Integer, Integer> adder5 = (x) -> {
            x += 2;
            x += 3;
            return x;
        };

        System.out.println(adder1.apply(5));
        System.out.println(mult2.apply(2));
        System.out.println(adder5.apply(5));

        boolean result4Div2 = isDivisible.apply(4, 2); // true
        boolean result3Div5 = isDivisible.apply(3, 5); // false
        System.out.println(result4Div2);
        System.out.println(result3Div5);

        Function<String, Integer> getLengthOfString = string -> string.length();
        printResultOfLambda(getLengthOfString);

        //the possibility to capture values from a context where the lambda is defined and use the
        // values within the body. This technique is called closure.
        final String hello = "Hello, ";
        Function<String, String> helloFunction = (name) -> hello + name;

        System.out.println(helloFunction.apply("John"));
        System.out.println(helloFunction.apply("Anastasia"));

        String role = "Manager";
        int salary = 1000;

        Function<Integer, Integer> getBonus = null;
        final int MANAGER_BONUS_PERCENT = 15;
        final int TEAM_LEAD_BONUS_PERCENT = 10;
        final int OTHER_BONUS_PERCENT = 5;

        switch(role) {
            case "Manager":
                getBonus = x -> x * MANAGER_BONUS_PERCENT / 100;
                break;
            case "Team Lead":
                getBonus = x -> x * TEAM_LEAD_BONUS_PERCENT / 100;
                break;
            case "Other":
                getBonus = x -> x * OTHER_BONUS_PERCENT / 100;
                break;
            default:
                System.out.println("Invalid role!");
                return;
        }

        int bonus = getBonus.apply(salary);
        System.out.println(bonus);

        IntBinaryOperator binaryOperator = (x, y) -> x > y ? x : y;

        System.out.println(binaryOperator.applyAsInt(2, 3));

        LongUnaryOperator unaryOperator = x -> (x + 1) % 2 == 0 ? x + 1 : x + 2;
        System.out.println(unaryOperator.applyAsLong(317));

        LongBinaryOperator binaryOperatorTwo = (x, y) -> {
            long product = 1;
            for (long i = x; i <= y; i++) {
                product *= i;
            }
            return product;
        };
        System.out.println(binaryOperatorTwo.applyAsLong(1, 4));
    }

    private static void printResultOfLambda(Function<String, Integer> function) {
        System.out.println(function.apply("HAPPY NEW YEAR 3000!"));
    }
}
