package Records;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        record User(String username, String password) {
            // empty body
        }

        User user = new User("Ibs", "sib");
        System.out.println(user.username() + " " + user.password());

        record User2(String username, String password) {
            public User2 {
                if (username == null || password == null) {
                    throw new IllegalArgumentException("Username and password must not be null");
                }
            }

            public String username() {
                return username.toUpperCase(Locale.ENGLISH);
            }
        }

        User2 user2 = new User2("sib", "ibs");
        System.out.println(user2.username() + " " + user2.password);

    }
}
