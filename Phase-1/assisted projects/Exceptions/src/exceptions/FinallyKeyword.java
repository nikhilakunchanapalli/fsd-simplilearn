package exceptions;

public class FinallyKeyword {
	public static void main(String[] args)
	{
		int a=45,b=6,rs=0;
		try
		{
			rs = a /b;
		}
		catch(ArithmeticException Ex)
		{
			System.out.print("\n\tError :"+ Ex.getMessage());
			
		}
		finally
		{
			System.out.print("\n\t The result is : " + rs);
		}
	}

}
