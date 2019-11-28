package OOPConceptPart2;

public class BMW extends Car {//has a relationship

	/*when same name method is present in parent class as well as child class with same number of arguments, is called
	method overriding*/
	public void start() {//overriden method
		System.out.println("BMW start");
	}
	
	public void TheftSafety() {
		System.out.println(" BMW TheftSafety");
	}
	
	
}
