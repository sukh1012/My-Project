package OOPConceprPart1;

public class LocalvsGlobalVariables {

	//Global variables/Class variables
	String name="Tom";
	int age=25;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=10;//local variable for main method.
		System.out.println(i);
		
		LocalvsGlobalVariables obj=new LocalvsGlobalVariables();
		System.out.println(obj.name);
		System.out.println(obj.age);
		
	}

	public void sum() {
		int i=15;//local variable for sum method.
		int j=20;
		
	}
	
	
	
}
