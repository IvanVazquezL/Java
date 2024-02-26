package Interfaces.Practice1;

public class Student implements Person{
    private String name;
    private String subject;

    public Student(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String toString() {
        return "Student:" + name + " Subject:" + subject;
    }
}
