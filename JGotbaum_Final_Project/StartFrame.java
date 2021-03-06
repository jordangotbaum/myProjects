
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class StartFrame extends JFrame {
    
    public StartFrame(BankApp b) {
        setTitle("Jordan's Banking App");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        centerWindow(this);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        StartPanel panel = new StartPanel(b);
        this.add(panel);
        setVisible(true);
    }
    
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;

    private void centerWindow(Window w) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        setLocation((d.width - w.getWidth()) / 2,
                (d.height - w.getHeight())/2);
    }
}
