package DataAccessObjectPractice.BookPractice;

import DataAccessObjectPractice.UserPractice.User;

import java.util.HashMap;
import java.util.Map;

public class BookDaoImpl implements BookDao{
    private final Map<Integer, Book> books;

    public BookDaoImpl() {
        this.books = new HashMap<>();
    }

    @Override
    public void add(Book book) {
        // write your code here
        books.put(book.getId(), book);
    }

    @Override
    public Book get(int id) {
        // write your code here
        return books.get(id);
    }

    @Override
    public void update(Book book) {
        // write your code here
        books.put(book.getId(), book);
    }

    @Override
    public void delete(int id) {
        // write your code here
        books.remove(id);
    }
}
