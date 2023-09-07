package tests;
import classes.*;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void testGetNumberOfPages() {
        Author author = new Author("Imię", "Nazwisko", 99);
        Statistics statistics = new Statistics();
        Book book = new Book("Tytuł", author, 123, "Powieść historyczna", 00001, statistics ){};
        Assert.assertEquals(book.getNumberOfPages(), 123);
    }

    @Test
    public void testGetBookCategory() {
        Author author = new Author("Imię", "Nazwisko", 99);
        Statistics statistics = new Statistics();
        Book book = new Book("Tytuł", author, 123, "Powieść historyczna", 00001, statistics ){};
        Assert.assertEquals(book.getBookCategory(), "Powieść historyczna");
    }

    @Test
    public void testSetNumberOfPages() {
        Author author = new Author("Imię", "Nazwisko", 99);
        Statistics statistics = new Statistics();
        Book book = new Book("Tytuł", author, 123, "Powieść historyczna", 00001, statistics ){};
        book.setNumberOfPages(231);
        Assert.assertEquals(book.getNumberOfPages(), 231);
    }

    @Test
    public void testSetBookCategory() {
        Author author = new Author("Imię", "Nazwisko", 99);
        Statistics statistics = new Statistics();
        Book book = new Book("Tytuł", author, 123, "Powieść historyczna", 00001, statistics ){};
        book.setBookCategory("Horror");
        Assert.assertEquals(book.getBookCategory(), "Horror");
    }

    @Test
    public void testToString(){
        Author author = new Author("Imię", "Nazwisko", 99);
        Statistics statistics = new Statistics();
        Book book = new Book("Tytuł", author, 123, "Powieść historyczna", 00001, statistics ){};
        String expected = "Ksiazka [tytul=Tytuł, autor=Nazwisko, dostepna=true, liczba stron=123, kategoria= Powieść historyczna]";
        Assert.assertEquals(book.toString(), expected);
    }
}