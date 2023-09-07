package tests;
import classes.*;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AuthorTest {

    @Test
    public void testGetBooks() {
        Author author = new Author("Henryk", "Sienkiewicz", 70);
        Statistics statistics = new Statistics();
        Book book = new Book("Quo Vadis", author, 345, "Powieść historyczna", 100001, statistics);
        author.addItem(book);
        Assert.assertTrue(author.getBooks().contains(book));
    }

    @Test
    public void testAddItem() {
        Author author = new Author("Henryk", "Sienkiewicz", 70);
        Statistics statistics = new Statistics();
        Book book = new Book("Quo Vadis", author, 345, "Powieść historyczna", 100001, statistics);
        author.addItem(book);
        Assert.assertTrue(author.getBooks().contains(book));
    }

    @Test
    public void testRemoveItem() {
        Author author = new Author("Henryk", "Sienkiewicz", 70);
        Statistics statistics = new Statistics();
        Book book = new Book("Quo Vadis", author, 345, "Powieść historyczna", 100001, statistics);
        author.addItem(book);
        Assert.assertTrue(author.getBooks().contains(book));
        author.removeItem(book);
        Assert.assertTrue(author.getBooks().isEmpty());
    }
}