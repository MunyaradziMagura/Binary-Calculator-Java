import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class validator {

	   // validate the input is binary
    public Boolean binary(String input) {
    	String valid = "1001";
    	// remove duplicate letters & empty spaces
    	String string = input;
        string = Arrays.asList(string.split(""))
                .stream()
                .distinct()
                .collect(Collectors.joining()).replace(" ", "").trim();
        StringBuilder newString = new StringBuilder();
        newString.append(string);
        
        // if the input is binary return true 
        if (valid.contains(newString)) return true;
        
        return false;
    }
    
    // check if the user inputs an invalid binary
    public String invalid(String number, String operation) {
    	Scanner sc = new Scanner(System.in);
    	while (binary(number) == false) {
    		System.out.print("Not a binary number!\n");
    		// input is incorrect
    		System.out.print(operation + ": ");
    		number = sc.nextLine().toLowerCase().trim();
    	}
		return number;
    }
    
    // reverse a given string
    public String reverse(String str) {
    	String [] convert = str.split("");
    	String result = "";
        for (int i = convert.length-1; i >= 0; i--) result = result + convert[i];
		return result;
    }
    
    // convert string to array list
	public ArrayList<Integer> toArraylist(String number) {
	    String[] result = number.split("");
		ArrayList<Integer> newList = new ArrayList<Integer>();
		for (int i = 0; i < result.length; i++){
			
			newList.add(Integer.parseInt(result[i]));
		}
	    return newList;
	}
	
	// convert an array list to a string
	public String arrayToString(ArrayList<Integer> list) {
	      StringBuffer newSting = new StringBuffer();
	      // for each element in the array list convert it to the string buffer
	      for (Integer i : list) newSting.append(i);
	      String result = newSting.toString();
	      
		return result;
	}
	public String format(String symbol, String x, String y, String result) {
		String formatted = null;
		if (x.length() > y.length()) {
			// add space before number
			formatted = " ".repeat(2) + x + "\n";
			formatted += symbol + " ".repeat((x.length() - y.length()) + 1) + y + "\n";
			formatted += "-".repeat(result.length() + 2) + "\n";
			formatted += " ".repeat(2) + result + "\n\n";
		}else if (x.length() < y.length()){
			formatted = " ".repeat((y.length() - x.length()) + 2) + x + "\n";
			formatted += symbol + " " + y + "\n";
			formatted += "-".repeat(result.length() + 2) + "\n";
			formatted += " ".repeat(2) + result + "\n\n";	
		}else{
			formatted = " ".repeat(2) + x + "\n";
			formatted += symbol + " " + y + "\n";
			formatted += "-".repeat(result.length() + 2) + "\n";
			formatted += " ".repeat(2) + result + "\n\n";
		}
		return formatted;
	}
}
