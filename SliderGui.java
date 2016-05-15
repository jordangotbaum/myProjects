import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.*;
import javax.swing.event.ChangeEvent;

/*
 * Jordan Gotbaum - Slider Assignment
 * CS203
 * 5/14/2016
 */

public class SliderGui {
    
    // Initialize object with default car icon.
    public SliderGui(){
        icon = new CarIcon(DEFAULT_SIZE);
        imagePan = new JLabel(icon);
    }
    
    // Setup frame dimensions and call setSlider.
    public void initGUI() {
        JFrame frame = new JFrame("Slider");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(F_WIDTH, F_HEIGHT));
        frame.setLayout(new BorderLayout());
        frame.add(this.imagePan, BorderLayout.CENTER);
        this.setSlider(frame);
        
        // Set visible after initializing slider.
        frame.setVisible(true);

    }
    
    public void setSlider(JFrame frame) {
        // Declare slider.
        JSlider sizeSlider = new JSlider(JSlider.VERTICAL, MIN_SIZE,
        MAX_SIZE, DEFAULT_SIZE);
        
        // Initialize slider fields and ChangeEvent.
        sizeSlider.setMajorTickSpacing(50);
        sizeSlider.setMinorTickSpacing(25);
        sizeSlider.setPaintTicks(true);
        sizeSlider.setPaintLabels(true);
        sizeSlider.addChangeListener((ChangeEvent e) -> {
            JSlider source = (JSlider)e.getSource();
            // If not moving...
            if (!source.getValueIsAdjusting()) {
                // Get level and call update icon.
                int level = (int)source.getValue();
                updateIcon(level);
            }
        });
        
        frame.add(sizeSlider, BorderLayout.WEST);
    }
    
    // Take input width and set icon width, then repaint.
    public void updateIcon(int aWidth) {
        this.icon.setWidth(aWidth);
        this.imagePan.repaint();
    }
    
    public static void main(String[] args) {
        SliderGui test = new SliderGui();
        test.initGUI();      
    }
    
    public CarIcon icon;
    private final JLabel imagePan;
    final int x = 450;
    final int y = 350;
    static final int F_WIDTH = 900;
    static final int F_HEIGHT = 700;
    static final int MAX_SIZE = 500;
    static final int MIN_SIZE = 0;
    static final int DEFAULT_SIZE = 75;       
}
