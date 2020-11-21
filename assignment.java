import java.util.*;

public class assignment {
	
    public static void main(String[] args) {
        // Truth Table class contains personal information
    	truthTables tables = new truthTables();
    	// Initialise addition class
    	addition add = new addition();
    	// Initialise subtraction class
    	subtraction sub = new subtraction();
    	validator validate = new validator();
    	
    	// print author information and truth tables 
    	tables.author();
    	tables.addition();
    	tables.subtraction();
    	tables.less_than();
    	
    	Boolean running = true;
    	Scanner sc = new Scanner(System.in);
		
	    // validate both binary numbers
    	String input = null;
    	String xInput = "";
    	String yInput = "";
    	String xValue = null;
    	String yValue = null;
    	while (running == true) {
    		System.out.print("Choose operation [+, -, q]: ");
    		input = sc.nextLine().toLowerCase().trim();
    		
    		// quit the program
    		if(input.equals("q")) running = false;
    		
    		// if the user wants to use addition or subtraction
    		if(input.equals("+") || input.equals("-")) {
    			
    				// Take in X input
    			 	System.out.print("X: ");
    			 	xInput = sc.nextLine().toLowerCase().trim();

    			 	// validate input
    				while( validate.binary(xInput) == false) xInput = validate.invalid(xInput, "X");
    				
    				// Take in Y input
    				System.out.print("Y: ");
    				yInput = sc.nextLine().toLowerCase().trim();
   
    				while( validate.binary(yInput) == false) yInput = validate.invalid(yInput, "Y");
    			 	// save original input for formatting 
    			 	xValue = xInput;
    				yValue = yInput;
    				// add 0 to the shortest string 
    				  if(xInput.length() > yInput.length()){ 
    					  yInput = "0".repeat(xInput.length() - yInput.length()) + yInput;	
    			        }else{
    			        	xInput = "0".repeat(yInput.length() - xInput.length()) + xInput;
    			        }
    				// convert binary numbers to array  for calculation
    				// addition or subtraction
    				String result = (input.equals("+")) ? add.calculate(xInput, yInput) : sub.calculate(xInput, yInput);
    				
    				// print the result 
    				System.out.print(validate.format(input, xValue, yValue, result));
    		    }
    		// wrong input
    		if( !( input.equals("q") || input.equals("-")  || input.equals("+") )) System.out.print("Invalid operation. \n\r");
    	}
    	sc.close();
    	System.out.print("\n[Q] Program has ended... :( \n");
    }
 
}
