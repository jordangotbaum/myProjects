
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.Icon;

/**
 * Assignment 2 | ShapeIcon | Jordan Gotbaum
 * @author jogotbaum
 */
public class ShapeIcon implements Icon {
    //Alter constructor to take first shape, initialize shapesList,
   //and add shape to shapesList.
   public ShapeIcon(MoveableShape shape,
      int width, int height)
   {
      this.shapesList = new ArrayList<MoveableShape>();
      shapesList.add(shape);
      this.width = width;
      this.height = height;
   }
   
   public int getIconWidth()
   {
      return width;
   }

   public int getIconHeight()
   {
      return height;
   }


   //Add functions to add and remove shapes from the shapesList.
   public void addShape(MoveableShape shape) {
      this.shapesList.add(shape);
   }

   public MoveableShape removeShape(int i) {
      MoveableShape shape = this.shapesList.get(i);
      this.shapesList.remove(i);
      return shape;
   }
   
   public ArrayList<MoveableShape> getShapesList() {
       return this.shapesList;
   }

   // Note: given that the paintIcon method takes in x and y coordinates, you would
   // want to expand the draw method such that it could take a list of such coordinates.
   // This would allow you to paint all the shapes in the ShapeIcon shapesList at 
   // specific coordinates.
   public void paintIcon(Component c, Graphics g, int x, int y)
   {
      Graphics2D g2 = (Graphics2D) g;
      for (MoveableShape shape : this.shapesList) {
         shape.draw(g2);
      }
   }

   private int width;
   private int height;
   //Remove individual shape field and replace with ArrayList of MoveableShape objects.
   private ArrayList<MoveableShape> shapesList;
}
