package stringregex;
import java.util.regex.*;

public class StringRegex {
	public static void main(String[] args) {

		String regex="[987]{3}[0-9]{7}";
		String input="9784527814";

		Pattern pattern= Pattern.compile(regex);

		Matcher match= pattern.matcher(input);

		if(match.matches())
		{
			System.out.println("Pattern Matched");
		}
		else
		{
			System.out.println("invalid input");
		}
	}

}


