package accessModifiers1;

public class AccessSpecifier {
	private void display()
	{
		System.out.println("You are using private access specifier");
	}
public static void main(String[] args) {
	//private
	System.out.println("Private Access Speicifier");
	AccessSpecifier obj = new AccessSpecifier();
	//trying to access private method of another class
	obj.display();

}
		
	}
