/**
   Greeter class creates simple greetings. Greeter objects have
   * the following functions defined herein: sayHello(), setName(),
   * swapNames(), a one parameter constructor, and a main method to
   * test the various classes.
*/

public class Greeter
{
   /**
      Constructs a Greeter object that can greet a person or 
      entity.
      @param aName the name of the person or entity who should
      be addressed in the greetings.
   */
   public Greeter(String aName)
   {
      name = aName;
   }

   /**
      Greet with a "Hello" message.
      @return a message containing "Hello" and the name of
      the greeted person or entity.
   */
   public String sayHello()
   {
      return "Hello, " + name + "!";
   }
   
   /**
    * Set the name of Greeter object.
    * @param nameIn a string input to the function, which is
    * passed in as the object's name.
    */
   public void setName(String nameIn)
   {
       this.name = nameIn;
   }

   /**
    * Swap names with another Greeter object.
    * @param other another Greeter object to swap names with.
    */
   public void swapNames(Greeter other)
   {
       String first_name = this.name;
       this.name = other.name;
       other.setName(first_name);
   }
   
   /**
    * @param name refers to the name field of the object.
    */
   private String name;
   
   /**
    * Main method creates three greeter objects to test other object classes.
    * @param args command line input.
    */
   public static void main(String[] args)
   {
       System.out.println("Note: Test outputs must be considered against"
                            + " source file inputs.");
       System.out.println("Tests for same object memory location:");
       Greeter tester1 = new Greeter("tester1");
       Greeter tester2 = new Greeter("tester2");
       
       tester1 = tester2;
       
       System.out.println(tester1.sayHello());
       tester2.setName("changed_2");
       System.out.println(tester1.sayHello());
       
       System.out.println("Tests for other functions in class:");
       
       String name1 = "test_name_1";
       String name2 = "test_name_2";
       String name3 = "test_name_3";
       Greeter greet1 = new Greeter(name1);
       Greeter greet2 = new Greeter(name2);
       Greeter greet3 = new Greeter(name3);
       
       System.out.println(greet1.sayHello());
       System.out.println(greet2.sayHello());
       System.out.println(greet3.sayHello());
       
       greet1.setName("name_changed_1");
       greet2.setName("name_changed_2");
       greet3.setName("name_changed_3");
       
       System.out.println(greet1.sayHello());
       System.out.println(greet2.sayHello());
       System.out.println(greet3.sayHello());
       
       greet1.swapNames(greet2);
       System.out.println(greet1.sayHello());
       
       greet2.swapNames(greet3);
       
       System.out.println(greet1.sayHello());
       System.out.println(greet2.sayHello());
       System.out.println(greet3.sayHello());   
   } 
}