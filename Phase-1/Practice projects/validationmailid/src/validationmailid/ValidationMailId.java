package validationmailid;

import java.util.regex.*;

import java.util.*;

public class ValidationMailId {
	
	public static void main(String args[]) {
		
		ArrayList<String>emails = new ArrayList<String>();
		
		emails.add("nikki@domain.co.in");
		emails.add("nikki@domain.com");
		emails.add("nikki.name@domain.com");
		emails.add("nikki#@domain.co.in");
		emails.add("nikki@domain.com");
		emails.add("nikki@domaincom");
		
		//add invalid email in list
		emails.add("@yahoo.com");
		emails.add("nikki#domain.com");
		
		//regular expression
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		
		//compiler regular expression to get the pattern
		Pattern pattern = Pattern.compile(regex);
		
		//Iterate emails array list
		for(String email : emails) {
			//create instance of matcher
		Matcher matcher = pattern.matcher(email);
			
			System.out.println(email +":"+matcher.matches()+"\n");
		}
	}
}
