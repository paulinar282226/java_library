package tests;
import classes.*;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void testGetTitle() {
        Author author = new Author("Imię", "Nazwisko", 99);
        Item item = new Item("Tytuł", author, 000001){};
        Assert.assertEquals(item.getTitle(), "Tytuł");
    }

    @Test
    public void testGetAuthor() {
        Author author = new Author("Imię", "Nazwisko", 99);
        Item item = new Item("Tytuł", author, 000001){};
        Assert.assertEquals(item.getAuthor(), author);
    }

    @Test
    public void testGetId() {
        Author author = new Author("Imię", "Nazwisko", 99);
        Item item = new Item("Tytuł", author, 000001){};
        Assert.assertEquals(item.getId(), 000001);
    }


    @Test
    public void testSetAvailable() {
        Author author = new Author("Imię", "Nazwisko", 99);
        Item item = new Item("Tytuł", author, 000001){};
        item.setAvailable(false);
        Assert.assertFalse(item.ifAvailable());
    }

    @Test
    public void testIfAvailable() {
        Author author = new Author("Imię", "Nazwisko", 99);
        Item item = new Item("Tytuł", author, 000001){};
        item.setAvailable(false);
        item.setAvailable(true);
        Assert.assertTrue(item.ifAvailable());
    }

    @Test
    public void testSetTitle() {
        Author author = new Author("Imię", "Nazwisko", 99);
        Item item = new Item("Tytuł", author, 000001){};
        item.setTitle("Quo Vadis");
        Assert.assertEquals(item.getTitle(), "Quo Vadis");
    }

    @Test
    public void testSetAuthor() {
        Author author = new Author("Imię", "Nazwisko", 99);
        Item item = new Item("Tytuł", author, 000001){};
        Author author1 = new Author("Henryk", "Sienkiewicz", 70);
        item.setAuthor(author1);
        Assert.assertEquals(item.getAuthor(), author1);
    }

    @Test
    public void testCompareTo() {
        Author author = new Author("Imię", "Nazwisko", 99);
        Item item = new Item("Tytuł", author, 000001){};
        Author author1 = new Author("Henryk", "Sienkiewicz", 70);
        Item item2 = new Item("Tytuł", author1, 000001){};
        Assert.assertEquals(-5, item.compareTo(item2));
    }
}