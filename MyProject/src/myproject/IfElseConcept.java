package myproject;

public class IfElseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=30;
		int b=20;
		
		if(b>a) {
		System.out.println("b is greater than a");
		}
		else {
		System.out.println("a is greater than b");
		}
		
		//Comparison operator
		// < > <= >= == !=
		//Write a program to find the highest number
		int c=100;
		int d=200;
		int e=300;
		
		//nested if else
		if(c>d & c>e) {
			System.out.println("c is greatest");
		}
		else if(d>e) {
			System.out.println("d is greatest");
		}
		else {
			System.out.println("e is greatest");
		}
		
		
		
	}

}
