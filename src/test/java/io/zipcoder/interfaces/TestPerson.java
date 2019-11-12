package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor() {
        Person person = new Person(34,"Muff");
        Assert.assertEquals(34,person.getId());
        Assert.assertEquals("Muff",person.getName());
    }

    @Test
    public void testSetName() {
        Person person = new Person(34,"Muff");
        person.setName("Ruff");
        Assert.assertEquals("Ruff",person.getName());
    }
}
