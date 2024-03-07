package CommandLineArguments;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i = i + 2) {
            if (args[i].equals("mode")) {
                System.out.println(args[i + 2]);
                return;
            }
        }
    }
}
