
import java.awt.Rectangle;
import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
/**
 *
 * @author jogotbaum
 */
public class PairApp {
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
        Rectangle first = new Rectangle(5, 10);
        Rectangle second = new Rectangle(6, 7);
        Rectangle third = new Rectangle(10, 11);

        ObjectOutputStream objOut;
        try {
            objOut = new ObjectOutputStream(new FileOutputStream("tester.txt"));
            Pair p1 = new Pair(first, second);
            System.out.println("Pair 1 before: ");
            System.out.println(p1 + "\n");
            Pair p2 = p1.clone();
            System.out.println("Pair 2 before: ");
            System.out.println(p2 + "\n");
            p2.setSecond(third);
            System.out.println("Pair 2 altered: ");
            System.out.println(p2 + "\n");
            objOut.writeObject(p1);
            objOut.writeObject(p2);
            ObjectInputStream objIn = new ObjectInputStream(new FileInputStream(new File("tester.txt")));
            Pair pnew1 = (Pair)objIn.readObject();
            System.out.println("Pair 1 after read/write: ");
            System.out.println(pnew1 + "\n");
            Pair pnew2 = (Pair)objIn.readObject();
            System.out.println("Pair 2 after read/write: ");
            System.out.println(pnew2 + "\n");
            objOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }     
    }   
    
}
