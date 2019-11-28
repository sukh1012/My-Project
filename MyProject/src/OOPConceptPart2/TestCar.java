package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//static polymorphism or compile time polymorphism
		BMW b=new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.TheftSafety();
		b.engine();
		System.out.println("******");
		
		Car c=new Car();
		c.start();
		c.stop();
		c.refuel();
		System.out.println("*******");
		
		//Top Casting
		Car c1=new BMW();/*child class object can be referred by parent class reference variable - dynamic polymorphism
		                 or runtime polymorphism*/
		c1.start();//Through this reference variable, only overriden methods and methods avaialble in car class can be called.
		c1.stop();
		c1.refuel();
		
		//Down Casting
		BMW b1=(BMW)new Car(); //ClassCastException
		
	}

}
