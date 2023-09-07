package tests;
import classes.*;

import org.junit.Assert;
import org.junit.Test;

public class RentTest {

    @Test
    public void testGetItem() {
        Reader reader = new Reader("Paulina", "Rejniak", 21, "AAAAA01");
        Author author = new Author("Imię", "Nazwisko", 99);
        Statistics statistics = new Statistics();
        Book book = new Book("Tytuł", author, 123, "Powieść historyczna", 00001, statistics ){};
        Rent rent = new Rent(reader, book, 30);
        Assert.assertEquals(rent.getItem(), book);
    }

    @Test
    public void testGetReader() {
        Reader reader = new Reader("Paulina", "Rejniak", 21, "AAAAA01");
        Author author = new Author("Imię", "Nazwisko", 99);
        Statistics statistics = new Statistics();
        Book book = new Book("Tytuł", author, 123, "Powieść historyczna", 00001, statistics ){};
        Rent rent = new Rent(reader, book, 30);
        Assert.assertEquals(rent.getReader(), reader);
    }

    @Test
    public void testGetRentID() {
        Reader reader = new Reader("Paulina", "Rejniak", 21, "AAAAA01");
        Author author = new Author("Imię", "Nazwisko", 99);
        Statistics statistics = new Statistics();
        Book book = new Book("Tytuł", author, 123, "Powieść historyczna", 00001, statistics ){};
        Rent rent = new Rent(reader, book, 30);
        Assert.assertEquals(rent.getRentID(), 9);

    }

    @Test
    public void testGetDaysToReturn() {
        Reader reader = new Reader("Paulina", "Rejniak", 21, "AAAAA01");
        Author author = new Author("Imię", "Nazwisko", 99);
        Statistics statistics = new Statistics();
        Book book = new Book("Tytuł", author, 123, "Powieść historyczna", 00001, statistics ){};
        Rent rent = new Rent(reader, book, 30);
        Assert.assertEquals(rent.getDaysToReturn(), 30);

    }

    @Test
    public void testIsReturned() {
        Reader reader = new Reader("Paulina", "Rejniak", 21, "AAAAA01");
        Author author = new Author("Imię", "Nazwisko", 99);
        Statistics statistics = new Statistics();
        Book book = new Book("Tytuł", author, 123, "Powieść historyczna", 00001, statistics ){};
        Rent rent = new Rent(reader, book, 30);
        Assert.assertFalse(rent.isReturned());
    }

    @Test
    public void testIsPenalty() {
        Reader reader = new Reader("Paulina", "Rejniak", 21, "AAAAA01");
        Author author = new Author("Imię", "Nazwisko", 99);
        Statistics statistics = new Statistics();
        Book book = new Book("Tytuł", author, 123, "Powieść historyczna", 00001, statistics ){};
        Rent rent = new Rent(reader, book, 30);
        Assert.assertFalse(rent.isPenalty());
    }

    @Test
    public void testGetPenaltyAmount() {
        Reader reader = new Reader("Paulina", "Rejniak", 21, "AAAAA01");
        Author author = new Author("Imię", "Nazwisko", 99);
        Statistics statistics = new Statistics();
        Book book = new Book("Tytuł", author, 123, "Powieść historyczna", 00001, statistics ){};
        Rent rent = new Rent(reader, book, 30);
        Assert.assertEquals(rent.getPenaltyAmount(), 0, 0.1);
    }

    @Test
    public void testSetReturned() {
        Reader reader = new Reader("Paulina", "Rejniak", 21, "AAAAA01");
        Author author = new Author("Imię", "Nazwisko", 99);
        Statistics statistics = new Statistics();
        Book book = new Book("Tytuł", author, 123, "Powieść historyczna", 00001, statistics ){};
        Rent rent = new Rent(reader, book, 30);
        Assert.assertFalse(rent.isReturned());
        rent.setReturned(true);
        Assert.assertTrue(rent.isReturned());
    }

    @Test
    public void testSetDaysToReturn() {
        Reader reader = new Reader("Paulina", "Rejniak", 21, "AAAAA01");
        Author author = new Author("Imię", "Nazwisko", 99);
        Statistics statistics = new Statistics();
        Book book = new Book("Tytuł", author, 123, "Powieść historyczna", 00001, statistics ){};
        Rent rent = new Rent(reader, book, 30);
        Assert.assertEquals(rent.getDaysToReturn(), 30);
        rent.setDaysToReturn(10);
        Assert.assertEquals(rent.getDaysToReturn(), 10);

    }

    @Test
    public void testSetPenalty() {
        Reader reader = new Reader("Paulina", "Rejniak", 21, "AAAAA01");
        Author author = new Author("Imię", "Nazwisko", 99);
        Statistics statistics = new Statistics();
        Book book = new Book("Tytuł", author, 123, "Powieść historyczna", 00001, statistics ){};
        Rent rent = new Rent(reader, book, 30);
        Assert.assertFalse(rent.isPenalty());
        rent.setPenalty(true);
        Assert.assertTrue(rent.isPenalty());
    }

    @Test
    public void testSetPenaltyAmount() {
        Reader reader = new Reader("Paulina", "Rejniak", 21, "AAAAA01");
        Author author = new Author("Imię", "Nazwisko", 99);
        Statistics statistics = new Statistics();
        Book book = new Book("Tytuł", author, 123, "Powieść historyczna", 00001, statistics ){};
        Rent rent = new Rent(reader, book, 30);
        rent.setPenaltyAmount(40);
        Assert.assertEquals(rent.getPenaltyAmount(), 40, 0.1);
    }
}