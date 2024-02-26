package DataAccessObjectPractice.BookPractice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookDao bookDao = new BookDaoImpl();

        int id1 = scanner.nextInt();
        scanner.nextLine();
        String title1 = scanner.nextLine();
        Book book1 = new Book(id1, title1);

        int id2 = scanner.nextInt();
        scanner.nextLine();
        String title2 = scanner.nextLine();
        Book book2 = new Book(id2, title2);

        int inexistentId = scanner.nextInt();

        bookDao.add(book1);
        bookDao.add(book2);

        // get first
        System.out.println("Found " + bookDao.get(book1.getId()));

        // get inexistent book
        if (bookDao.get(inexistentId) == null) {
            System.out.println("Not found id " + inexistentId);
        }

        // update and get
        Book updatedBook = bookDao.get(book2.getId());
        System.out.println("Found " + updatedBook);
        updatedBook.setTitle("UPDATED");
        bookDao.update(updatedBook);
        System.out.println("Updated " + bookDao.get(book2.getId()));

        // delete
        bookDao.delete(book2.getId());
        if (bookDao.get(book2.getId()) == null) {
            System.out.println("Deleted id: " + book2.getId());
        }
    }
}
