package OOPConceprPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloading obj= new MethodOverloading();
		
		obj.sum();
		obj.sum(10);
		obj.sum(10,5);
	}

	//we can overload main method also.
	//you can not create a method inside a method.
	//duplicate methods i.e. same method name with same no. of arguments and same data type are not allowed.
	
	//method overloading is when the method name is same with different arguments or input parameters within the same class.
	// if no. of arguments is same. Make sure there data type is different for method overloading.
	public void sum() {//0 input parameter
		System.out.println("sum method----zero parameter");
	}
	
	public void sum(double d) {//1 input parametrs
		System.out.println("sum method---1 parameter");
	}
	
	public void sum(int i) {//1 input parametrs
		System.out.println("sum method---1 parameter");
		System.out.println(i);
	}
	
	public void sum(int k, int l) {//2 input parametrs
		System.out.println("sum method---2 parameter");
		System.out.println(k+l);
	}
	
	
	
	
	
	
}
