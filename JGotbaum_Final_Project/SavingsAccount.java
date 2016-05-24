
public class SavingsAccount implements BankAccount {
    
    public SavingsAccount(String aName, String pass) {
        name = aName;
        password = pass;
        balance = 0;
    }
    
    @Override
    public String getType() {
        return this.TYPE;
    }
    
    @Override
    public String getResponse() {
        return this.response;
    }
    
    @Override
    public String getPass() {
        return this.password;
    }
    
    @Override
    public void deposit(double amount){
        double newBal = this.getBalance() + amount;
        this.balance = newBal;
        
        if (this.balance < 0) {
            this.isOverdrawn = 1;
        } else {
            this.isOverdrawn = 0;
        }
        
        this.response = String.format("Balance = %f", this.getBalance());
    }
    
    @Override
    public void withdraw(double amount){
        double newBal = this.getBalance() - amount;
        if (newBal > 0) {
            this.balance = newBal;
            this.isOverdrawn = 0;
            this.response = String.format("Withdrawl succesful. Balance = %f",
                    this.getBalance());
        } else {
            this.isOverdrawn = 1;
            this.response = String.format("Failed. Amount, %f, greater" +
                    " than balance, %f.",
                    amount, this.getBalance());
        }
    }
    
    @Override
    public double getBalance(){
        return this.balance;
    }
    
    @Override
    public String getName(){
        return this.name;
    }
    
    @Override
    public void transfer(double amount, BankAccount toAcc) {
        if (this.getBalance() >= amount) {
            this.withdraw(amount);
            toAcc.deposit(amount);
            this.response = "Transfer successful.";
        }
        else {
            this.response = String.format("Failed. Amount, %f, greater" +
                    " than balance, %f.",
                    amount, this.getBalance());
        }
    }
    
    public void addInterest() {
        double newBal = (this.getBalance() * 1.01);
        this.balance = newBal;
    }
    
    public String response;
    private int isOverdrawn = 0;
    private static final double INTEREST_RATE = 0.01;
    private static final String TYPE = "Savings";
    private String name;
    private String password;
    private double balance;
    
}
