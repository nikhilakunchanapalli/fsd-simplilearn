package string;

public class StringTypes {
	public static void main(String[] args) {
		//methods of strings
		System.out.println("Methods of Strings");
		
		String sr=new String("Hello World");
		System.out.println(sr.length());
		
		//substring
		String sub= new String("Welcome");
		System.out.println(sub.substring(2));
		
		//String Comparison
		String s1="Heldo";
		String s2="Hello";
		System.out.println(s1.compareTo(s2));
		
		//IsEmpty
		String s4="";
		System.out.println(s4.isEmpty());
		
		//toLowerCase
		String s5="HELLO";
		System.out.println(s5.toLowerCase());
		
		//replace
		String s6="Hello";
		String replace=s6.replace('o', '1' );
		System.out.println(replace);
		
		//equals
		String x="Welcome to Java";
		String y="WelcomE to Java";
		System.out.println(x.equals(y));
		
		
		
		System.out.println("\n");
		System.out.println("Creating StringBuffer");
		
		StringBuffer s=new StringBuffer("Welcome to Java!");
		s.append("Enjoy your learning");
		System.out.println(s);
		
		//insert method
		s.insert(0,  '$');
		System.out.println(s);
		
		//replace method
		StringBuffer sb=new StringBuffer("Hello");
		sb.replace(0, 2,  "hSs");
		System.out.println(sb);
		
		//delete method
		sb.delete(0, 1);
		System.out.println(sb);
		
		//StringBuilder
		System.out.println("\n");
		System.out.println("Creating StringBuilder");
		StringBuilder sb1=new StringBuilder("Happy");
		sb1.append("Learning");
		System.out.println(sb1);
		
		System.out.println(sb1.delete(0, 1));
		
		System.out.println(sb1.reverse());
		
		
		//conversion
		System.out.println("\n");
		System.out.println("Conversion of String to StringBuilder");
		
		String str = "Hello";
	
		//conversion from String object to stringBuffer
		
		StringBuffer sbr  = new StringBuffer(str);
		sbr.reverse();
		System.out.println("String to StringBuffer");
		System.out.println(sbr);
		
		
		//conversion of String object to StringBuilder
		StringBuilder sbl = new StringBuilder(str);
		sbl.append("world");
		System.out.println("String to StringBuilder");
		System.out.println(sbl);
	}

}
