package tests;
import classes.*;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class StatisticsTest {

    @Test
    public void testGetItemRentCount() {
        Library library = new Library();
        Reader reader = new Reader("Paulina", "Rejniak", 21, "AAAAA01");
        Author author = new Author("Imię", "Nazwisko", 99);
        Book book = new Book("Tytuł", author, 123, "Powieść historyczna", 00001, library.getStatistics()){};
        library.rentItem(book, reader);
        Rent rent = library.getRentById(1);
        Map<String, Integer> x = new HashMap<>();
        String key = book.getTitle() + book.getAuthor();
        x.put(key, 1);
        Assert.assertEquals(library.getStatistics().getItemRentCount(), x);
    }

    @Test
    public void testGetAllItems() {
        Author author = new Author("Imię", "Nazwisko", 99);
        Statistics statistics = new Statistics();
        Book book = new Book("Tytuł", author, 123, "Powieść historyczna", 00001, statistics ){};
        Assert.assertTrue(statistics.getAllItems().contains(book));

    }

    @Test
    public void testGetReaderRentCount() {
        Library library = new Library();
        Reader reader = new Reader("Paulina", "Rejniak", 21, "AAAAA01");
        Author author = new Author("Imię", "Nazwisko", 99);
        Book book = new Book("Tytuł", author, 123, "Powieść historyczna", 00001, library.getStatistics() ){};
        library.rentItem(book, reader);
        Assert.assertTrue(library.getStatistics().getReaderRentCount().containsKey(reader));
    }

    @Test
    public void testAddRent() {
        Library library = new Library();
        Reader reader = new Reader("Paulina", "Rejniak", 21, "AAAAA01");
        Author author = new Author("Imię", "Nazwisko", 99);
        Book book = new Book("Tytuł", author, 123, "Powieść historyczna", 00001, library.getStatistics()){};
        library.rentItem(book, reader);
        Rent rent = library.getRentById(1);
        Map<String, Integer> x = new HashMap<>();
        String key = book.getTitle() + book.getAuthor();
        x.put(key, 1);
        Assert.assertEquals(library.getStatistics().getItemRentCount(), x);
    }

    @Test
    public void testAddReader() {
        Library library = new Library();
        Reader reader = new Reader("Paulina", "Rejniak", 21, "AAAAA01");
        Author author = new Author("Imię", "Nazwisko", 99);
        Book book = new Book("Tytuł", author, 123, "Powieść historyczna", 00001, library.getStatistics() ){};
        library.rentItem(book, reader);
        Assert.assertTrue(library.getStatistics().getReaderRentCount().containsKey(reader));
    }

    @Test
    public void testGetMostRentedItem() {
        Library library = new Library();
        Reader reader = new Reader("Paulina", "Rejniak", 21, "AAAAA01");
        Author author = new Author("Imię", "Nazwisko", 99);
        Book book = new Book("Tytuł", author, 123, "Powieść historyczna", 00001, library.getStatistics() ){};
        Book book1 = new Book("Tytuł", author, 123, "Powieść historyczna", 00002, library.getStatistics() ){};
        Book book2 = new Book("Tytuł1", author, 123, "Powieść historyczna", 00002, library.getStatistics() ){};
        library.rentItem(book, reader);
        library.rentItem(book1, reader);
        library.rentItem(book2, reader);
        String key = book.getTitle() + book.getAuthor();
        Assert.assertEquals(library.getStatistics().getMostRentedItem(), key);
    }

    @Test
    public void testGetMostActiveReader() {
        Library library = new Library();
        Reader reader = new Reader("Paulina", "Rejniak", 21, "AAAAA01");
        Reader reader1 = new Reader("Piotr", "Rejniak", 21, "AAAAA01");
        Author author = new Author("Imię", "Nazwisko", 99);
        Book book = new Book("Tytuł", author, 123, "Powieść historyczna", 00001, library.getStatistics() ){};
        Book book1 = new Book("Tytuł", author, 123, "Powieść historyczna", 00002, library.getStatistics() ){};
        Book book2 = new Book("Tytuł1", author, 123, "Powieść historyczna", 00002, library.getStatistics() ){};
        library.rentItem(book, reader);
        library.rentItem(book1, reader);
        library.rentItem(book2, reader1);
        Assert.assertEquals(library.getStatistics().getMostActiveReader(), reader.toString());
    }

    @Test
    public void testAddItem() {
        Author author = new Author("Imię", "Nazwisko", 99);
        Statistics statistics = new Statistics();
        Book book = new Book("Tytuł", author, 123, "Powieść historyczna", 00001, statistics ){};
        Assert.assertTrue(statistics.getAllItems().contains(book));
    }

    @Test
    public void testGetBooksNeverRented() {
        Author author = new Author("Imię", "Nazwisko", 99);
        Statistics statistics = new Statistics();
        Book book = new Book("Tytuł", author, 123, "Powieść historyczna", 00001, statistics ){};
        String key = book.getTitle() + book.getAuthor();
        Assert.assertFalse(statistics.getMostRentedItem().contains(key));
    }
}