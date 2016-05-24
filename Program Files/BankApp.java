
import java.util.ArrayList;

public class BankApp {
    
    public BankApp() {
    }
    
    public static void main(String[] args) {
        BankApp b = new BankApp();
        StartFrame test = new StartFrame(b);
    }
    
    public ArrayList<BankAccount> acctList = new ArrayList<BankAccount>();
    
}
