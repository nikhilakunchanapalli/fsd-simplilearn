package constructor;

public class ParamConstrDemo {
	
	public static void main(String[] args) {
		//student id, name
		ParameterConst std1=new ParameterConst(2,"Nikki");
		ParameterConst std2=new ParameterConst(10,"Anu");
		std1.display();
		std2.display();
	}

}
