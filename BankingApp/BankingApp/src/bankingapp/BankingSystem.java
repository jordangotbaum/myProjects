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
public class BankingSystem {
    private ArrayList<BankAccount> acctsList;
    
    public BankingSystem() {
        acctsList = new ArrayList<BankAccount>();
    }
    
    public ArrayList<BankAccount> getAcctsList() {
        return this.acctsList;
    }
    
    public BankAccount getAcct(int i){
        return this.acctsList.get(i);
    }
    
    public BankAccount remAcct(int i){
        BankAccount acct = this.getAcct(i);
        this.acctsList.remove(i);
        return acct;
    }
    
    public void addAcct(BankAccount b) {
        this.acctsList.add(b);
    }
    
    
    
}
