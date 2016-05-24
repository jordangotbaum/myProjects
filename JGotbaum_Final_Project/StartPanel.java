
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author Jordan
 */
public class StartPanel extends JPanel {
    
    public StartPanel(BankApp b) {
        
        JPanel displayPanel = new JPanel();
        displayPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        name = new JTextField(20);
        nameLabel = new JLabel("Name:");
        displayPanel.add(nameLabel);
        displayPanel.add(name);

        
        pass = new JTextField(20);        
        passLabel = new JLabel("Password:");
        displayPanel.add(passLabel);
        displayPanel.add(pass);
        
        
        JPanel responsePan = new JPanel();
        responsePan.setLayout(new FlowLayout(FlowLayout.TRAILING));
        
        sysResponse = new JLabel();
        responsePan.add(sysResponse);
        
        JPanel buttonPan = new JPanel();
        buttonPan.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        login = new JButton("Login");
        login.addActionListener((ActionEvent e) -> {
            loginButtonEvent(e, b);
        });
        
        newAcct = new JButton("Make Account");
        newAcct.addActionListener((ActionEvent e) -> {
            newAcctButtonEvent(e, b);
        });
        
        viewAccts = new JButton("View Accounts");
        viewAccts.addActionListener((ActionEvent e) -> {
            viewAcctsButtonEvent(e, b);
        });
        
        buttonPan.add(login);
        buttonPan.add(newAcct);
        buttonPan.add(viewAccts);
        
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.add(displayPanel, "Enter Info:");
        this.add(responsePan, "Response:");
        this.add(buttonPan, "Buttons");
    }
   
    private final JButton newAcct, login, viewAccts;
    private final JTextField name, pass;
    private final JLabel nameLabel, passLabel, sysResponse;

    private void loginButtonEvent(ActionEvent e, BankApp b) {
        String password = pass.getText();
        String acctId = name.getText();
        for (int i = 0; i < b.acctList.size(); i++) {
            if (b.acctList.get(i).getName().equals(acctId)) {
                if (b.acctList.get(i).getPass().equals(password)) {
                    JFrame frame = new AccountFrame(b.acctList.get(i), b);
                }
            }
        }
        name.setText("");
        pass.setText("");
    }

    private void newAcctButtonEvent(ActionEvent e, BankApp b) {
        String password = pass.getText();
        String acctId = name.getText();
        if (password == null | acctId == null) {
            sysResponse.setText("Invalid password or name.");
        } else {
            String acctType = JOptionPane.showInputDialog("Please enter 'Checking' or 'Savings'.");
            if (acctType.equals("Checking")) {
                CheckingAccount acct = new CheckingAccount(acctId, password);
                b.acctList.add(acct);
                sysResponse.setText("Account successfully created.");
            }
            else if (acctType.equals("Savings")) {
                SavingsAccount acct = new SavingsAccount(acctId, password);
                b.acctList.add(acct);
                sysResponse.setText("Account successfully created.");
            }
            else {
                sysResponse.setText("Invalid account type.");
            }
        }
        name.setText("");
        pass.setText("");
    }

    private void viewAcctsButtonEvent(ActionEvent e, BankApp b) {
        JFrame f = new JFrame("Accounts List.");
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < b.acctList.size(); i++) {
            list.add(b.acctList.get(i).getName() +
                    " - " + b.acctList.get(i).getType());
        }
        String[] newList = list.toArray(new String[0]);
        f.add(new JList(newList));
        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
    
}
