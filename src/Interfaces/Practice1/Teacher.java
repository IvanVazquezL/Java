package Interfaces.Practice1;

public class Teacher implements Person{
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Teacher:" + name + " Subject:" + subject;
    }
}
