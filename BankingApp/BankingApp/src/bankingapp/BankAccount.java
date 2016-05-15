/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingapp;
import java.util.*;

/**
 *
 * @author jogotbaum
 */
public class BankAccount implements Comparable<BankAccount>{
    private String name;
    private double balance;
    
    public BankAccount(String tName, double tBal) {
        name = tName;
        balance = tBal;
    }
    
    public String getName() {
        return this.name;
    }
    
    public double getBalance() {
        return this.balance;
    }
    
    public int compareTo(BankAccount other) {
        if (balance < other.balance) return -1;
        if (balance > other.balance) return 1;
        return 0;
    }
    
    public static Comparator<BankAccount> createComparatorByName()
    {
        return new Comparator<BankAccount>() {
            
            public int compare(BankAccount b1, BankAccount b2) {
                return b1.getName().compareTo(b2.getName());
            }
        };
    }
    
    public static Comparator<BankAccount> createComparatorByBalance()
    {
        return new Comparator<BankAccount>() {
            
            public int compare (BankAccount b1, BankAccount b2) {
                return b1.compareTo(b2);
            }
        };
    }
    
}
