package Interfaces.Practice1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            String[] inputs = sc.nextLine().split(":");
            if (inputs[0].startsWith("T")) {
                // handle teacher
                Teacher teacher = new Teacher(inputs[1], inputs[2]);
                System.out.println(teacher);
            }
            else if (inputs[0].startsWith("S")) {
                // handle student
                Student student = new Student(inputs[1], inputs[2]);
                System.out.println(student);
            }
        }

        sc.close();
    }
}
