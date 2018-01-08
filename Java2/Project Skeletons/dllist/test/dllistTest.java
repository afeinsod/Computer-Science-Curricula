/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import dllist.dllist;
import org.junit.*;
import static org.junit.Assert.assertEquals;
import java.util.NoSuchElementException;

public class dllistTest {

    @Test
    public void startsEmptyTest() {
        dllist lst = new dllist();
        assertEquals(true, lst.isEmpty());
    }

	@Test
    public void notEmptyTest() {
        dllist lst = new dllist();
	lst.insert("test", dllist.position.LAST);
        assertEquals(false, lst.isEmpty());
    }

	@Test
    public void insertLastGetItemTest() {
        dllist lst = new dllist();
	lst.insert("test", dllist.position.LAST);
        assertEquals("test", lst.getItem());
    }


	@Test
    public void insertFirstGetItemTest() {
        dllist lst = new dllist();
	lst.insert("test", dllist.position.FIRST);
        assertEquals("test", lst.getItem());
    }



	@Test
    public void insertPreviousTest() {
        dllist lst = new dllist();
	lst.insert("A", dllist.position.LAST);
	lst.insert("B", dllist.position.LAST);
	lst.insert("C", dllist.position.LAST);
	lst.insert("D", dllist.position.PREVIOUS);
	lst.setPosition(dllist.position.LAST);
	assertEquals("C", lst.getItem());
    }
	
	@Test
	public void insertRandomTest() {
        dllist lst = new dllist();
	lst.insert("A", dllist.position.FIRST);
	lst.insert("B", dllist.position.LAST);
	lst.insert("C", dllist.position.PREVIOUS);
	lst.insert("D", dllist.position.FOLLOWING);
	lst.insert("E", dllist.position.FOLLOWING);
	assertEquals("E", lst.getItem());
	lst.setPosition(dllist.position.FIRST);
	assertEquals("A", lst.getItem());
	lst.setPosition(dllist.position.FOLLOWING);
	assertEquals("C", lst.getItem());
	lst.setPosition(dllist.position.FOLLOWING);
	assertEquals("D", lst.getItem());
	lst.setPosition(dllist.position.LAST);
	assertEquals("B", lst.getItem());
    }

	@Test
	public void getPositionTest() {
        dllist lst = new dllist();
	lst.insert("A", dllist.position.FIRST);
	lst.insert("B", dllist.position.LAST);
	lst.insert("C", dllist.position.PREVIOUS);
	lst.insert("D", dllist.position.FOLLOWING);
	lst.insert("E", dllist.position.FOLLOWING);
	assertEquals(3, lst.getPosition());
	lst.setPosition(dllist.position.FIRST);
	assertEquals(0, lst.getPosition());
	lst.setPosition(dllist.position.FOLLOWING);
	assertEquals(1, lst.getPosition());
	lst.setPosition(dllist.position.FOLLOWING);
	assertEquals(2, lst.getPosition());
	lst.setPosition(dllist.position.LAST);
	assertEquals(4, lst.getPosition());
    }


	@Test(expected=NoSuchElementException.class)
    public void emptyGetItemTest() {
        dllist lst = new dllist();
	lst.getItem();
    }

	@Test(expected=NoSuchElementException.class)
    public void emptyGetPositionTest() {
        dllist lst = new dllist();
	lst.getPosition();
    }





}
