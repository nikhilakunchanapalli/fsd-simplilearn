package ExceptionHandlers;

public class Example {
	
	public static void main(String args []) {
		try 
		{
			System.out.println("Statring of try block");
			//i am throwing the custom exception using throw
			throw new MyException("This is My error Message");
		}
		catch (MyException exp) {
			System.out.println("Catch Block");
			System.out.println(exp);
		}
	}

}