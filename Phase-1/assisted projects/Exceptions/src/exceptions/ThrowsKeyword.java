package exceptions;

public class ThrowsKeyword {
	void Division() throws ArithmeticException
	{
		int a=45,b=9,rs;
		rs = a / b;
		System.out.println("\ntThe result is : " +rs);
				
	}
	public static void main(String[] args)
	{
		ThrowsKeyword T = new ThrowsKeyword();
		try
		{
			T.Division();
		}
		catch(ArithmeticException Ex)
		{
			System.out.print("\ntError : " +Ex.getMessage());
		}
		System.out.println("\ntEnd of program.");
	}

}
