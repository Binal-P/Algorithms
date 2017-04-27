package com.algo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by Binal on 4/26/17.
 */
public class SinglyLinkedListTest {

    private SinglyLinkedList list = new SinglyLinkedList();

    @Before
    public void setUp(){
        list.add(3);
        list.add(32);
        list.add(54);
        list.add(50);
    }

    @Test
    public void testLength() {
        assertEquals(4, list.length());
    }

}
