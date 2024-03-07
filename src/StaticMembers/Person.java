package StaticMembers;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        // Update total population and average age when a new person is created
        totalPopulation++;
        totalAge += age;
        averageAge = totalAge / totalPopulation;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Static fields to track population and average age
    public static int totalPopulation = 0;
    public static int totalAge = 0;
    public static int averageAge = 0;

    public static void printStatistics() {
        System.out.println("Total population: " + totalPopulation);
        System.out.println("Total age: " + totalAge);
        System.out.println("Average age: " + averageAge);
        System.out.println("");
    }

}
