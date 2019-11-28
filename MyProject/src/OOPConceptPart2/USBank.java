package OOPConceptPart2;

public interface USBank {

	int min_bal=100;
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	//only method declaration.
	//no method body - only method prototype.
	//in interface, we can declare the variables, vars are by default static in nature.
	//vars value cannot be changed means they are final/constant in nature.
	//no static method in interface.
	//no main methods in interface.
	//we cannot create object of interface, means interface is abstract in nature.
	
}
