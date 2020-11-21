
public class operators {
	
	/*Takes one input argument x which is a binary digit (i.e.,
	either 0 or 1) and returns a binary digit which is a result of
	performing NOT operation with the input value.*/
	public  int NOT_OP(int i)
	{
		return (i == 0) ? 1 : 0;
	}
	
	/*Takes two input arguments x and y as binary digits (i.e.,
	either 0 or 1) and returns a binary digit which is a result of
	performing AND operation with the input values.*/
	public  int AND_OP(int x, int y)
	{
		return x & y;
	}
	
	/*Takes two input arguments x and y as binary digits (i.e.,
	either 0 or 1) and returns a binary digit which is a result of
	performing OR operation with the input values.*/
	public  int OR_OP(int x, int y)
	{
		return x | y;
	}
	/*Takes two input arguments x and y as binary digits (i.e.,
	either 0 or 1) and returns a binary digit which is a result of
	performing Exclusive OR operation with the input
	values. This function must be implemented by calling the
	functions described above.*/
	public  int XOR_OP(int x, int y)
	{
	
		return  (!(x == 1 && y == 1) && (x == 1 || y == 1)) ? 1 : 0;
	}

}
