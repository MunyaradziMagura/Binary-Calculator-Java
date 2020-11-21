import java.util.ArrayList;
import java.util.Collections;
public class addition {
	functions function = new functions();
	validator validate = new validator();
	public String calculate(String x, String y) {
		int carry = 0;
		int count = (x.length() > y.length()) ? x.length() : y.length();
		// create array lists of our inputed strings
		ArrayList<Integer> xValue = validate.toArraylist(validate.reverse(x));
		ArrayList<Integer> yValue = validate.toArraylist(validate.reverse(y));;
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		// calculate add
		for (int i = 0; i < count; i++){
			result.add(i, function.ADD_BIT(xValue.get(i), yValue.get(i), carry));
			carry = function.CARRY_BIT(xValue.get(i),yValue.get(i), carry);
		}
		// reverse the array list 
		Collections.reverse(result);

		// add carry bit & convert array list to string  
		String binaryNumber = (carry == 0) ? validate.arrayToString(result) :  carry + validate.arrayToString(result); 
		
		return binaryNumber;
	}
	
}
