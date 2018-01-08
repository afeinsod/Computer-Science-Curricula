/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;


public class LinkedListTest {

    private double EPSILON = 1e-15;

    @Test
    public void basicTest() {
        SinglyLinkedListImpl<Integer> l = new SinglyLinkedListImpl<Integer>();
        l.add(2);
        assertEquals(2, l.getHead(), EPSILON);
    }

}