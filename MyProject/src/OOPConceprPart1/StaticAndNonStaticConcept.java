package OOPConceprPart1;

public class StaticAndNonStaticConcept {

	//global vars: the scope of global vars will be available across all the functions with some condition.
	
	String name="Tom";//non static global variable
	static int age=25;//static global variable
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//how to call static methods and variables
		//1. direct calling
		sum();
		//calling by classname
		StaticAndNonStaticConcept.sum();
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);
		
		//how to call non static methods and variables
		StaticAndNonStaticConcept obj= new StaticAndNonStaticConcept();
		obj.SendMail();
		System.out.println(obj.name);
		
		//Can i access static methods using object reference? yes
		obj.sum(); //warning will be given
		
	}

	public void SendMail() {//non static method
		System.out.println("send mail method");
	}
	
	public static void sum() {//static method
		System.out.println("sum method");
	}
	
	
}
