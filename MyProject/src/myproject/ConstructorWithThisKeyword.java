package myproject;

public class ConstructorWithThisKeyword {

	//class variables
	String name;
	int age;
	
	public ConstructorWithThisKeyword(String name, int age) {
		//this.global variable=local variable
		//so this keyword is used to initialize class/global variable inside a constructor.
		this.name=name;
		this.age=age;
		System.out.println(name);
		System.out.println(age);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Tom",30);
		
		
	}

}
