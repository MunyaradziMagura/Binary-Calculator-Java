import java.util.ArrayList;
import java.util.Collections;

public class subtraction {
	functions function = new functions();
	validator validate = new validator();
	public String calculate(String x, String y) {
		int carry = 0;
		int lessThan = 0;
		Boolean negative = false;
		int count = (x.length() > y.length()) ? x.length() : y.length();
		// create array lists of our inputed strings
		ArrayList<Integer> xValue = validate.toArraylist(validate.reverse(x));
		ArrayList<Integer> yValue = validate.toArraylist(validate.reverse(y));;
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for (int i = 0; i < count; i++){

			if (function.LESS_THAN(xValue.get(i), yValue.get(i), lessThan) != 0) {
				// switch between negative states toggle
				negative = !(negative);
				result.add(i, function.SUB_BIT(yValue.get(i), xValue.get(i), carry));
			}else{
				result.add(i, function.SUB_BIT(xValue.get(i), yValue.get(i), carry));
			}
			// carry and less than values 
			carry = function.BORROW_BIT(xValue.get(i),yValue.get(i), carry);
			lessThan = function.LESS_THAN(xValue.get(i), yValue.get(i), lessThan);
		}

		// reverse the array list 
		Collections.reverse(result);
		// add carry bit & convert array list to string  
		String binaryNumber = (carry == 0) ? validate.arrayToString(result) :  carry + validate.arrayToString(result); 
		// add the negative symbol
		binaryNumber = (negative == false) ? binaryNumber : "-" + binaryNumber;
		
		return binaryNumber;
		
	}
}
