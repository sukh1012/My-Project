package OOPConceprPart1;

public class CallByValAndCallByRef {
	
	int p;
	int q;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CallByValAndCallByRef obj=new CallByValAndCallByRef();
		int x=10;
		int y=20;
		obj.testsum(x, y); //call by value or pass by value.
		//copy of x & y will be given to a & b.
		//no changes will be there in the original value of x & y if there are any changes in value of a & b.
	
		obj.p=50;
		obj.q=60;
		
		obj.swap(obj);
		//after swap
		System.out.println(obj.p);
		System.out.println(obj.q);
		
	}

	public int testsum(int a, int b) {
		int c=a+b;
		return c;
	}
	//call by reference
	public void swap(CallByValAndCallByRef t) {
		int temp;
		temp=t.p; //temp=50
		t.p=t.q; //t.p=60
		t.q=temp; //t.q=50;
	}
	
	
	
	
}
