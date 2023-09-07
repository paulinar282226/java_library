package tests;
import classes.*;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PeopleTest {

    @Test
    public void testGetName() {
        People people = new People("Paulina", "Rejniak", 21){};
        Assert.assertEquals(people.getName(), "Paulina");
    }

    @Test
    public void testGetSurname() {
        People people = new People("Paulina", "Rejniak", 21){};
        Assert.assertEquals(people.getSurname(), "Rejniak");
    }

    @Test
    public void testGetAge() {
        People people = new People("Paulina", "Rejniak", 21){};
        Assert.assertEquals(people.getAge(), 21);
    }

    @Test
    public void testSetName() {
        People people = new People("Paulina", "Rejniak", 21){};
        people.setName("Piotrek");
        Assert.assertEquals(people.getName(), "Piotrek");
    }

    @Test
    public void testSetSurname() {
        People people = new People("Paulina", "Rejniak", 21){};
        people.setSurname("Kowalski");
        Assert.assertEquals(people.getSurname(), "Kowalski");

    }

    @Test
    public void testSetAge() {
        People people = new People("Paulina", "Rejniak", 21){};
        people.setAge(22);
        Assert.assertEquals(people.getAge(), 22);
    }
}