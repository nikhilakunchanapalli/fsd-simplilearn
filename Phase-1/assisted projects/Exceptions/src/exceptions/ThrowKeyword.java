package exceptions;

public class ThrowKeyword {
	public static void main(String args [])
	{
		int a=45,b=5,rs;
		
		try
		{
			if(b==0)
				throw(new ArithmeticException("Can't divide by zero."));
			else
			{
				rs = a /b;
				System.out.println("\n\tThe result is : " +rs);
			}
		}
		catch(ArithmeticException Ex)
		{
			System.out.println("\n\tError : " + Ex.getMessage());
		}
		System.out.println("\n\tEnd of program.");
	}

}
