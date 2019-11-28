package myproject;

public class LoopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. While loop
		/*disadvantage of while loop: it will generate infinite loop if
		we don't give incremental/decremental part*/
		
		int i=1;  //initialization
		while(i<=10) {  // conditional part
			System.out.println(i);
			i=i+1;  //Incremental/Decremental part
			
		}
		System.out.println("*********");
		// j++ means j=j+1
		//2. For loop
		for(int j=1; j<=10; j++) {
			System.out.println(j);
			if(j==5) {
				break;
			}
		}
		
		
		
		
		
	}

}
