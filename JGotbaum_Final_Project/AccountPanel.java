
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class AccountPanel extends JPanel {
    
    public AccountPanel(BankAccount account, BankApp b) {
        JPanel displayPanel = new JPanel();
        displayPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        amountLabel = new JLabel("Amount:");
        displayPanel.add(amountLabel);
        
        amountText = new JTextField(13);
        displayPanel.add(amountText);
        
        JPanel resultPanel = new JPanel();
        resultPanel.setLayout((new FlowLayout(FlowLayout.LEFT)));
        
        resultLabel = new JLabel("");
        resultPanel.add(resultLabel);
        
        // Buttons.
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        depositButton = new JButton("Deposit");
        depositButton.addActionListener((ActionEvent e) -> {
            depositButtonEvent(e, account);
            this.repaint();
        });
        buttonPanel.add(depositButton);
        
        withdrawButton = new JButton("Withdraw");
        withdrawButton.addActionListener((ActionEvent e) -> {
            withdrawButtonEvent(e, account);
            this.repaint();
        });
        buttonPanel.add(withdrawButton);
        
        transferButton = new JButton("Transfer");
        transferButton.addActionListener((ActionEvent e) -> {
            transferButtonEvent(e, account, b);
            this.repaint();
        });
        buttonPanel.add(transferButton);
        
        
        this.setLayout(new BorderLayout());
        this.add(displayPanel, BorderLayout.WEST);
        this.add(resultPanel, BorderLayout.SOUTH);
        this.add(buttonPanel, BorderLayout.EAST); 
        
    }
    
    private void depositButtonEvent(ActionEvent e, BankAccount account) {
        try {
            double d_in = Double.parseDouble(amountText.getText());
            account.deposit(d_in);
            resultLabel.setText(account.getResponse());
            amountText.setText("");
        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid Amount.");
            amountText.setText("");
        }
    }
    
    private void withdrawButtonEvent(ActionEvent e, BankAccount account) {
        try {
            double d_in = Double.parseDouble(amountText.getText());
            account.withdraw(d_in);
            resultLabel.setText(account.getResponse());
            amountText.setText("");
        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid Amount.");
        }  
    }
    
    private void transferButtonEvent(ActionEvent e, BankAccount account, BankApp b) {
        try {
            double d_in = Double.parseDouble(amountText.getText());
            String otherAcct = 
                    JOptionPane.showInputDialog("Please enter destination account:");
            BankAccount other = null;
            for (int i = 0; i < b.acctList.size(); i++) {
                if (b.acctList.get(i).getName().equals(otherAcct)) {
                    other = b.acctList.get(i);
                }
            }
            if (other != null) {
                account.transfer(d_in, other); 
                resultLabel.setText(account.getResponse());
                amountText.setText("");
            } else {
                resultLabel.setText("Invalid destination account.");
            }
        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid amount.");
            amountText.setText("");
        }
    }
    
    double result;
    private final JButton depositButton, withdrawButton, transferButton;
    private final JTextField amountText;
    private final JLabel amountLabel, resultLabel;


    
}
