package myproject;

public class ArrayConcept {

	public static void main(String[] args) {
	
		//array: to store similar data types values in a array variable.
		//1. int array
		//lower bound/index = 0
		//upper bound/index = n-1 (n is the size of the array)
		//one dimensional array
		
		//disadvantage of arrays
		//1. size is fixed - static array -- To overcome this problem, we use collections/dynamic array - Array list, hashtable etc.
		//2. stores only similar data types -- To overcome this problem, we use object array.
		
		
		int i[]=new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		System.out.println(i.length); //it will give size/length of an array.
		//System.out.println(i[4]); //ArrayIndexOutOfBounds
		//to print all values of array, use for loop
		for(int j=0;j<i.length;j++) {
			System.out.println(i[j]);
		}
		
		//2.double array
		double d[]=new double[3];
		d[0]=12.33;
		d[1]=13.44;
		d[2]=45.55;
		System.out.println(d[2]);
		
		//3.char array
		char c[]=new char[3];
		c[0]='a';
		c[1]=2;
		c[2]='$';
		
		//4. boolean array
		boolean b[]= new boolean[2];
		b[0]=true;
		b[1]=false;
		
		//5. String array
		String s[]=new String[3];
		s[0]="test";
		s[1]="Hello";
		s[2]="World";
		System.out.println(s.length);
		
		//6. Object array -- object is the superclass of all the classes
		//is used to store different data types values.
		Object ob[] = new Object[6];
		ob[0]="Tom";
		ob[1]=25;
		ob[2]=12.33;
		ob[3]="1/1/1990";
		ob[4]='M';
		ob[5]="London";
		
		System.out.println(ob[5]);
		
		
	}

}
