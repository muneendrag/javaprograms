package oopsConcept;
class Bank{
	double rateOfIntrest() {
		return 0;	
	}
}
class SBI extends Bank{
	double rateOfIntrest() {
		return 10.5;		
	}
}
class ICICI extends Bank{
	double rateOfIntrest() {
		return 9.5;	
	}
}
class AXIS extends Bank{
	double rateOfIntrest() {
		return 8.5;		
	}
}
public class MethodOverriding {
	public static void main(String[] args) {
		Bank b=new Bank();
		System.out.println(b.rateOfIntrest());
		
		SBI sbi=new SBI();
		double d=sbi.rateOfIntrest();
		System.out.println(d);
		
		ICICI icici=new ICICI();
		System.out.println(icici.rateOfIntrest());
		
		AXIS axis=new AXIS();
		System.out.println(axis.rateOfIntrest());
				
	}
}
