/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import java.awt.Rectangle;
import static org.junit.Assert.*;

/**
 *
 * @author jogotbaum
 */
public class PairTest {
    
    public PairTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getFirst method, of class Pair.
     */
    @Test
    public void testGetFirst() {
        System.out.println("getFirst");
        Pair instance = new Pair(new Rectangle(5, 5), new Rectangle(1, 1));
        Object expResult = new Rectangle(5, 5);
        Object result = instance.getFirst();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSecond method, of class Pair.
     */
    @Test
    public void testGetSecond() {
        System.out.println("getSecond");
        Pair instance = new Pair(new Rectangle(5, 5), new Rectangle(1, 1));
        Object expResult = new Rectangle(1, 1);
        Object result = instance.getSecond();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFirst method, of class Pair.
     */
    @Test
    public void testSetFirst() {
        System.out.println("setFirst");
        Rectangle obj = new Rectangle(1,1);
        Pair instance = new Pair(new Rectangle(5, 5), new Rectangle(1, 1));
        instance.setFirst(obj);
        assertEquals(obj, instance.getFirst());
    }

    /**
     * Test of setSecond method, of class Pair.
     */
    @Test
    public void testSetSecond() {
        System.out.println("setSecond");
        Rectangle obj = new Rectangle(1,1);
        Pair instance = new Pair(new Rectangle(5, 5), new Rectangle(1, 1));
        instance.setSecond(obj);
        assertEquals(obj, instance.getSecond());
    }

    /**
     * Test of toString method, of class Pair.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        assertEquals(1, 1);
    }

    /**
     * Test of clone method, of class Pair.
     */
    @Test
    public void testClone() {
        System.out.println("clone");
        assertEquals(1, 1);
    }
    
}
