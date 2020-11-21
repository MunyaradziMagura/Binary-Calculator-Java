
public class functions {
	// import operations 
	operators operator = new operators();
	
	/*Performs a single-bit addition operation by taking two input
	arguments x and y as binary digits (i.e., either 0 or 1), and
	returns a binary digit which is a result of adding the two
	input arguments x and y (i.e. x + y) while considering c
	which is carried over from the result of addition in the lower
	digit (i.e. output of CARRY_BIT() function at the lower
	digit).*/
	public int ADD_BIT(int x, int y, int c){
		return operator.XOR_OP(operator.XOR_OP(x, y), c);
	}
	
	/*Returns a value to be carried over to the higher digit when
	calculating single-bit addition of x and y while considering
	c which is carried over from the lower digit (i.e. output of
	CARRY_BIT() function at the lower digit)*/
	public int CARRY_BIT(int x, int y, int c){
		return operator.OR_OP(operator.AND_OP(x, y), operator.AND_OP(c, operator.XOR_OP(x, y)));
	}
	
	/*Performs single-bit subtraction operation by taking two input
	arguments x and y as binary digits (i.e., either 0 or 1), and
	returns a binary digit which is a result of subtracting y from
	x (i.e. x – y) considering b which indicates it has lent to the
	lower digit subtraction (i.e. output of BORROW_BIT()
	function at the lower digit)*/
	public int SUB_BIT(int x, int y, int b){
		return operator.XOR_OP(operator.XOR_OP(x, y), b);
	}
	
	/*Returns whether if it had to borrow from the higher digit
	when calculating the single-bit subtraction of x and y
	considering b which indicates it has lent to the lower digit
	(i.e. output of BORROW_BIT() function at the lower digit).*/
	public int BORROW_BIT(int x, int y, int b){
		return operator.OR_OP(b * operator.NOT_OP(operator.XOR_OP(x, y)), (operator.NOT_OP(x) * y));
	}
	
	/*Performs single-bit comparison by taking two input
	arguments x and y as binary digits (i.e., either 0 or 1), and
	returns a binary digit which indicates whether if x is less
	than y considering l which was the result of comparing the
	lower digit (i.e. output of LESS_THAN() function at the
	lower digit).*/
	public int LESS_THAN(int x, int y, int l){
		return operator.AND_OP(operator.OR_OP(operator.AND_OP(operator.NOT_OP(x), y), l), operator.NOT_OP(operator.AND_OP(operator.NOT_OP(y), x)));
	}
	
	
}