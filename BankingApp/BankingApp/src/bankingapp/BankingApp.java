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
public class BankingApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BankingSystem sys = new BankingSystem();
        double[] balances = {45, 1001, 150, 20, 2500, 30, 30.1, 59, 90, 1000};
        String[] names = {"a", "k", "c", "o", "q", "f", "z", "h", "y", "j"};
        

        for (int i = 0; i < balances.length; i++) {
            BankAccount temp = new BankAccount(names[i], balances[i]);
            sys.addAcct(temp);
        }
        
        System.out.println("First Run: \n");       
        for (BankAccount a : sys.getAcctsList()) {
            System.out.println("Name: " + a.getName() +
                    " Balance: " + a.getBalance());
        }
        
        Collections.sort(sys.getAcctsList(), BankAccount.createComparatorByName());
        
        System.out.println("\nSorted By Name: \n");
        for (BankAccount a : sys.getAcctsList()) {
            System.out.println("Name: " + a.getName() +
                    " Balance: " + a.getBalance());
        }
        
        Collections.sort(sys.getAcctsList(), BankAccount.createComparatorByBalance());

        System.out.println("\nSorted By Balance: \n");        
        for (BankAccount a : sys.getAcctsList()) {
            System.out.println("Name: " + a.getName() +
                    " Balance: " + a.getBalance());
        }
        
        
    }
    
}
