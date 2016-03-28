/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingapp;

import java.util.Comparator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jogotbaum
 */
public class BankAccountTest {
    
    public BankAccountTest() {
    }
    
    BankAccount test1 = new BankAccount("Jordan", 10);
    BankAccount test2 = new BankAccount("Emily", 5);
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getName method, of class BankAccount.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        BankAccount instance = test1;
        String expResult = "Jordan";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getBalance method, of class BankAccount.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        BankAccount instance = test1;
        double expResult = 10;
        double result = instance.getBalance();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of compareTo method, of class BankAccount.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        BankAccount other = test2;
        BankAccount instance = test1;
        int expResult = 1;
        int result = instance.compareTo(other);
        assertEquals(expResult, result);
    }

    /**
     * Test of createComparatorByName method, of class BankAccount.
     */
    @Test
    public void testCreateComparatorByName() {
        System.out.println("createComparatorByName");
        Comparator<BankAccount> expResult = null;
        Comparator<BankAccount> result = BankAccount.createComparatorByName();
        assertEquals(1, 1);
    }

    /**
     * Test of createComparatorByBalance method, of class BankAccount.
     */
    @Test
    public void testCreateComparatorByBalance() {
        System.out.println("createComparatorByBalance");
        Comparator<BankAccount> expResult = null;
        Comparator<BankAccount> result = BankAccount.createComparatorByBalance();
        assertEquals(1, 1);
    }
    
}
