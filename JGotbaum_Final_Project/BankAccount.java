
public interface BankAccount {
    
    public String getPass();
    
    public String getType();
    
    public void deposit(double amount);
    
    public void withdraw(double amount);
    
    public double getBalance();
    
    public String getName();
    
    public String getResponse();
    
    public void transfer(double amount, BankAccount toAcc);

}
