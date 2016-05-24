import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
   This program implements an animation that moves
   a car shape.
*/
public class AnimationTester
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      //Initialize multiple shape objects.

      final MoveableShape shape0
            = new CarShape(0, 0, CAR_WIDTH);
      final MoveableShape shape1
            = new CarShape(1, 1, CAR_WIDTH);
      final MoveableShape shape2
            = new CarShape(1, 2, CAR_WIDTH);

      //Shape0 added in constructor.
      ShapeIcon icon = new ShapeIcon(shape0,
            ICON_WIDTH, ICON_HEIGHT);

      //Other shapes added subsequently.
      icon.addShape(shape1);
      icon.addShape(shape2);

      final JLabel label = new JLabel(icon);
      frame.setLayout(new FlowLayout());
      frame.add(label);

      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setVisible(true);

      final int DELAY = 100;
      // Milliseconds between timer ticks
      Timer t = new Timer(DELAY, new
         ActionListener()
         {
            public void actionPerformed(ActionEvent event)
            {
               //Changed ActionEvent to translate all shapes in the shapesList.
               for (MoveableShape shape : icon.shapesList) {
                  shape.translate(1, 0);
               }
               label.repaint();
            }
         });
      t.start();
   }

   private static final int ICON_WIDTH = 400;
   private static final int ICON_HEIGHT = 100;
   private static final int CAR_WIDTH = 100;
}