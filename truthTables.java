public class truthTables {
	// import functions
	functions function = new functions();
	// valid binary values 
	String[] binary = {"000","010","100","110","001","101","111"};
	// print my user information
	public void author() {
		System.out.println("Author: Munyaradzi Magura "
				+ "\nStudent ID: 11025679 "
				+ "\nEmail: magmy020 "
				+ "\nThis is my own work as defined by the University's Academic Misconduct Policy.");
	}
	
	// convert char to integer
	private int toInt(char ch) {
		return Integer.parseInt(String.valueOf(ch));
	}
	
	// make addition truth table
	public void addition() {
		System.out.println("ADDITION \n\rc x y Z C \n\r---------");
		// Iterate through the binary list and get each value and the individual values at each letter
		for(int i = 0; i < binary.length; i++) {
			System.out.println(binary[i].replace("", " ").trim() + " "  + 
								function.ADD_BIT(toInt(binary[i].charAt(0)), toInt(binary[i].charAt(1)), toInt(binary[i].charAt(2))) + " " + 
								function.CARRY_BIT(toInt(binary[i].charAt(0)), toInt(binary[i].charAt(1)), toInt(binary[i].charAt(2))) + "\r\n" );
			}	
	}
	
	public void subtraction() {
		System.out.println("SUBTRACTION\r\nb x y Z B \r\n--------");
		for(int i = 0; i < binary.length; i++) {
			System.out.println(binary[i].replace("", " ").trim() + " "  + 
								function.SUB_BIT(toInt(binary[i].charAt(0)), toInt(binary[i].charAt(1)), toInt(binary[i].charAt(2))) + " " + 
								function.BORROW_BIT(toInt(binary[i].charAt(0)), toInt(binary[i].charAt(1)), toInt(binary[i].charAt(2))) + "\r\n" );
			}	
		
	}
	
	// make the less than truth table 
	public void less_than() {
		System.out.println("LESS_THAN \r\nl x y L \r\n---------");
		for(int i = 0; i < binary.length; i++) {
			System.out.println(binary[i].replace("", " ").trim() + " "  + 
								function.LESS_THAN(toInt(binary[i].charAt(0)), toInt(binary[i].charAt(1)), toInt(binary[i].charAt(2))) + "\r\n" );
			}	
	}
	

}
