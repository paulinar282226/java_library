package tests;
import classes.*;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryTest {

    @Test
    public void testGetRentByID() {
        Library library = new Library();
        Reader reader = new Reader("Paulina", "Rejniak", 21, "AAAAA01");
        Author author = new Author("Imię", "Nazwisko", 99);
        Statistics statistics = new Statistics();
        Book book = new Book("Tytuł", author, 123, "Powieść historyczna", 00001, statistics ){};
        int id = library.rentItem(book, reader);
        Rent rent = library.getRentById(id);
        Assert.assertTrue(library.getRents().contains(rent));
        library.returnItem(rent);
    }

    @Test
    public void testRentItemExc() {
        Library library = new Library();
        Reader reader = new Reader("Paulina", "Rejniak", 21, "AAAAA01");
        Author author = new Author("Imię", "Nazwisko", 99);
        Statistics statistics = new Statistics();
        Book book = new Book("Tytuł", author, 123, "Powieść historyczna", 00001, statistics) {
        };
        Book book1 = new Book("Tytuł", author, 123, "Powieść historyczna", 00002, statistics) {
        };
        book1.setAvailable(false);
        try {
            int id = library.rentItem(book, reader);
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testRentItem() {
        Library library = new Library();
        Reader reader = new Reader("Paulina", "Rejniak", 21, "AAAAA01");
        Author author = new Author("Imię", "Nazwisko", 99);
        Statistics statistics = new Statistics();
        Book book = new Book("Tytuł", author, 123, "Powieść historyczna", 00001, statistics ){};
        Book book1 = new Book("Tytuł", author, 123, "Powieść historyczna", 00002, statistics ){};
        book1.setAvailable(false);
        int id = library.rentItem(book, reader);
        Assert.assertFalse(book.ifAvailable());
        String key1 = book1.getTitle() + book1.getAuthor();
        Rent rent = library.getRentById(id);
        Assert.assertTrue(library.getRents().contains(rent));
        library.returnItem(rent);

    }

    @Test
    public void testReturnItem() {
        Library library = new Library();
        Reader reader = new Reader("Paulina", "Rejniak", 21, "AAAAA01");
        Author author = new Author("Imię", "Nazwisko", 99);
        Statistics statistics = new Statistics();
        Book book = new Book("Tytuł", author, 123, "Powieść historyczna", 00001, statistics ){};
        int id = library.rentItem(book, reader);
        Rent rent = library.getRentById(id);
        Assert.assertTrue(library.getRents().contains(rent));
        library.returnItem(rent);
        Assert.assertFalse(library.getRents().contains(rent));
    }


    @Test
    public void testCountPenalty() {
        Library library = new Library();
        Reader reader = new Reader("Paulina", "Rejniak", 21, "AAAAA01");
        Author author = new Author("Imię", "Nazwisko", 99);
        Statistics statistics = new Statistics();
        Book book = new Book("Tytuł", author, 123, "Powieść historyczna", 00001, statistics ){};
        int id = library.rentItem(book, reader);
        Rent rent = library.getRentById(id);
        Assert.assertEquals(rent.getPenaltyAmount(), 0, 0.1);
        }



}


