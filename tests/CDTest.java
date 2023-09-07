package tests;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import classes.*;

public class CDTest {

    @Test
    public void testGetDuration() {
        Author author = new Author("Imię", "Nazwisko", 99);
        Statistics statistics = new Statistics();
        CD cd = new CD("Tytuł", author, 123, "Rock", 00001, statistics ){};
        Assert.assertEquals(cd.getDuration(), 123);
    }

    @Test
    public void testGetCdCategory() {
        Author author = new Author("Imię", "Nazwisko", 99);
        Statistics statistics = new Statistics();
        CD cd = new CD("Tytuł", author, 123, "Rock", 00001, statistics ){};
        Assert.assertEquals(cd.getCdCategory(), "Rock");

    }

    @Test
    public void testSetDuration() {
        Author author = new Author("Imię", "Nazwisko", 99);
        Statistics statistics = new Statistics();
        CD cd = new CD("Tytuł", author, 123, "Rock", 00001, statistics ){};
        cd.setDuration(120);
        Assert.assertEquals(cd.getDuration(), 120);

    }

    @Test
    public void testSetCdCategory() {
        Author author = new Author("Imię", "Nazwisko", 99);
        Statistics statistics = new Statistics();
        CD cd = new CD("Tytuł", author, 123, "Rock", 00001, statistics ){};
        cd.setCdCategory("pop");
        Assert.assertEquals(cd.getCdCategory(), "pop");
    }
    @Test
    public void testToString(){
        Author author = new Author("Imię", "Nazwisko", 99);
        Statistics statistics = new Statistics();
        CD cd = new CD("Tytuł", author, 123, "Rock", 00001, statistics ){};
        String expected = "CD [tytul=Tytuł, autor=Nazwisko, dostepna=true, czas trwania=123, kategoria= Rock]";
        Assert.assertEquals(cd.toString(), expected);
    }
}