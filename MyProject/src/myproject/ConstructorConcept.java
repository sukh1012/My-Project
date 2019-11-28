package myproject;

public class ConstructorConcept {

	//constructor overloading
	public ConstructorConcept() {
		System.out.println("Default constructor");
	}
	
	public ConstructorConcept(int i) {
		System.out.println("Single param constructor");
		System.out.println("The value of i is " + i);
	}
	public ConstructorConcept(int i, int j) {
		System.out.println("Two params constructor");
		System.out.println("The value of i is " + i);
		System.out.println("The value of j is " + j);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(10,20);

		
		
	}

}
