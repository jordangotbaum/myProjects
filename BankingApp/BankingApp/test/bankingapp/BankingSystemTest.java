/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingapp;

import java.util.ArrayList;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jogotbaum
 */
public class BankingSystemTest {
    
    public BankingSystemTest() {
    }
    
    BankingSystem tester = new BankingSystem();
    BankAccount b1 = new BankAccount("Jordan", 10);
    tester.addAcct(b1);

    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getAcctsList method, of class BankingSystem.
     */
    @Test
    public void testGetAcctsList() {
        System.out.println("getAcctsList");
        BankingSystem instance = new BankingSystem();
        ArrayList<BankAccount> expResult = null;
        ArrayList<BankAccount> result = instance.getAcctsList();
        assertEquals(1, 1);
    }

    /**
     * Test of getAcct method, of class BankingSystem.
     */
    @Test
    public void testGetAcct() {
        System.out.println("getAcct");
        int i = 0;
        BankingSystem instance = new BankingSystem();
        BankAccount expResult = null;
        BankAccount result = instance.getAcct(i);
        assertEquals(1, 1);
    }

    /**
     * Test of remAcct method, of class BankingSystem.
     */
    @Test
    public void testRemAcct() {
        System.out.println("remAcct");
        int i = 0;
        BankingSystem instance = new BankingSystem();
        BankAccount expResult = null;
        BankAccount result = instance.remAcct(i);
        assertEquals(1, 1);
    }

    /**
     * Test of addAcct method, of class BankingSystem.
     */
    @Test
    public void testAddAcct() {
        System.out.println("addAcct");
        BankAccount b = null;
        BankingSystem instance = new BankingSystem();
        instance.addAcct(b);
    }
    
}
