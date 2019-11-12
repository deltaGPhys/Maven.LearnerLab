package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPeople {

    private People people;
    private Person person1;
    private Person person2;
    private Person person3;

    @Before
    public void setUp() throws Exception {
        people = new People();
        person1 = new Person(1,"Stu");
        person2 = new Person(42,"Hank");
        person3 = new Person(5, "Kay");
    }

    @Test
    public void testAdd() {
        Assert.assertEquals(0, people.count());
        people.add(person1);
        Assert.assertEquals(1, people.count());
    }

    @Test
    public void testRemove() {
        people.add(person1);
        people.add(person2);
        Assert.assertEquals(2, people.count());
        Assert.assertTrue(people.contains(person1));
        people.remove(person1);
        Assert.assertEquals(1, people.count());
        Assert.assertFalse(people.contains(person1));
    }

    @Test
    public void testFindById() {
        people.add(person1);
        people.add(person2);
        people.add(person3);

        Assert.assertEquals(person2, people.findById(42));
    }
}
