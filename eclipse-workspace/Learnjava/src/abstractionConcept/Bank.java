package abstractionConcept;

public abstract class Bank {
	public abstract void loan();//abstract method--it doesn't contain any body
	//an abstract class can have both abstract and non abstract methods
	//an abstract class must contain one abstract method
	//abstract class
	
	public void credit() {
		System.out.println("bank credit");
	}
	public void debit() {
		System.out.println("bank debit");
	}
	

}
