import java.util.Scanner;
import java.math.*;

@SuppressWarnings("unused")
public class MainRoot {

	@SuppressWarnings("resource")
	// main method to execute statements
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creating DemoRoot object to instantiate number variable  
				DemoRoot db=new DemoRoot();
			
				// creating scanner object to initializing the number variable from the user
				Scanner sc=new Scanner(System.in);
        
				// print the statement asking user to enter input       
          System.out.println("enter the number:");
         
          // passing the user provided input to the number variable of DemoRoot calss
          db.number=sc.nextInt();
       
          // method to find square root of user input   
         Math.sqrt(db.number);
         
         // method to find cube root of user input
         Math.cbrt(db.number);
         
         //display the input value
         System.out.println("number is :"+db.number);
         
         //displays square root of the given input
         System.out.println("Square root of number is:"+Math.sqrt(db.number));
         
         //displays the cube root of the given input
         System.out.println("Cube root of number is:"+Math.cbrt(db.number));
	}

}
