package ExceptionHandlers;

public class MyException extends Exception{
	
	String str1;
	MyException(String str2) {
		str1=str2;
		
	}
	public String toString() {
		return ("MyException Occured: " +str1);
	}
	
	

}
