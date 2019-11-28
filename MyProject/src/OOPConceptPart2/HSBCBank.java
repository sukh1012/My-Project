package OOPConceptPart2;

public class HSBCBank implements USBank, BrazilBank{//we are achieving multiple inheritance.
//is-a relationship
	
	//if a class is implementing any interface, then its mandatory to define/override all the methods of interface.
	//overriding from USBank.
	public void credit() {
		System.out.println("hsbc-credit");
	}
	
	public void debit() {
		System.out.println("hsbc-debit");
	}
	
	public void transferMoney() {
		System.out.println("hsbc-transfermoney");
	}
	
	//separate methods of hsbc class.
	public void educationLoan() {
		System.out.println("hsbc-edu loan");
	}
	
	public void carLoan() {
		System.out.println("hsbc-car loan");
	}
	
	//Brazil Bank method overriding from BrazilBank
	public void mutualfund() {
		System.out.println("hsbc-mutual fund");
		
	}
	
	
	
	
}
