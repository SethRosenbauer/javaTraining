import java.util.Date;

import com.teamtreehouse.Treet;

public class Example {
  
  public static void main(String[] args) {
    
    Treet treet = new Treet(    
        "Seth Rosenbauer",    
        "Want to be famous? Simply tweet about Java!",
         new Date(1420813507000L)   
    );
    System.out.printf("This is a new Treet:  %s %n", treet);
    
  }
}