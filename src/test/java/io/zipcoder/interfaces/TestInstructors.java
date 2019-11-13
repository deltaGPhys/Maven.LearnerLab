package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {

    @Test
    public void test() {
        Assert.assertEquals("Kris", Instructors.getInstance().findById(1).getName());
        Assert.assertEquals("Chris", Instructors.getInstance().findById(9).getName());
        Assert.assertEquals("Froilan", Instructors.getInstance().findById(10).getName());
        Assert.assertEquals("Dolio", Instructors.getInstance().findById(11).getName());
        Assert.assertEquals("Roberto", Instructors.getInstance().findById(6).getName());
    }
}
