import java.util.ArrayList;

public class Exceptions {

 public void testing() {
  ArrayList < Object > arr = new ArrayList < > ();
  arr.add("13");
  arr.add("hello world");
  arr.add(48);
  arr.add("Goodbye World");

       for (int i = 0; i < arr.size(); i++) {

               try {
                Integer castedValue = (Integer) arr.get(i);
                System.out.println(castedValue);
                } catch (ClassCastException e) {
              
                  System.err.println("Error: Value ID: " + i + " ErrorFound: (Is not an Integer value)");
   
            }
        }

     }

}