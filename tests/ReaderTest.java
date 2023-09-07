package tests;
import classes.*;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ReaderTest {

    @Test
    public void testGetCardNum() {
        Reader reader = new Reader("Paulina","Rejniak",21, "AAAA01");
        Assert.assertEquals(reader.getCardNum(),"AAAA01");

    }

    @Test
    public void testRentItem() {
        Reader reader = new Reader("Paulina","Rejniak",21, "AAAA01");
        Author author = new Author("Henryk", "Sienkiewciz", 70);
        Statistics statistics = new Statistics();
        Book book = new Book("Quo Vadis", author, 432, "Powieść historyczna",00001, statistics);
        reader.rentItem(book);
        Assert.assertTrue(reader.getRentedItems().contains(book));
    }

    @Test
    public void testReturnItem() {
        Reader reader = new Reader("Paulina","Rejniak",21, "AAAA01");
        Author author = new Author("Henryk", "Sienkiewciz", 70);
        Statistics statistics = new Statistics();
        Book book = new Book("Quo Vadis", author, 432, "Powieść historyczna",00001, statistics);
        reader.rentItem(book);
        Assert.assertTrue(reader.getRentedItems().contains(book));
        reader.returnItem(book);
        Assert.assertTrue(reader.getRentedItems().isEmpty());
    }


    @Test
    public void testGetRentedItems() {
        Reader reader = new Reader("Paulina","Rejniak",21, "AAAA01");
        Author author = new Author("Henryk", "Sienkiewciz", 70);
        Statistics statistics = new Statistics();
        Book book = new Book("Quo Vadis", author, 432, "Powieść historyczna",00001, statistics);
        reader.rentItem(book);
        Assert.assertTrue(reader.getRentedItems().contains(book));

    }

    @Test
    public void testSetCardNum() {
        Reader reader = new Reader("Paulina","Rejniak",21, "AAAA01");
        reader.setCardNum("AAAA02");
        Assert.assertEquals(reader.getCardNum(),"AAAA02" );
    }


    @Test
    public void testIfRented() {
        Reader reader = new Reader("Paulina","Rejniak",21, "AAAA01");
        Author author = new Author("Henryk", "Sienkiewciz", 70);
        Statistics statistics = new Statistics();
        Book book = new Book("Quo Vadis", author, 432, "Powieść historyczna",00001, statistics);
        Assert.assertTrue(reader.getRentedItems().isEmpty());

    }

}