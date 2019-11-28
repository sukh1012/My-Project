package myproject;

public class B extends A{

	public B() {
		super(10);// super keyword is used to call parent class constructor
		// while creating an object of child class,, only a single parent constructor will be called.
		//if we are calling a parametrised constructor using super keyword, then default parent constructor will not be called.
		//if we don't pass anything in super keyword, default parent class constructor will be called.
		//super keyword should be used in child class constructor only and it should be the 1st statement in any constructor.
		System.out.println("child class constructor");
	}
	
	
	public static void main(String args[]) {
		B obj= new B();
	}
	
}
