package org.example;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SomeClassTest {

    @Test
    public void testSum() {
        SomeClass someClass = new SomeClass(2, 3);
        assertThat(someClass.getSum(), is(5));
    }
}
