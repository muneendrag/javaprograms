package abstractionConcept;

public class TestBank {

	public static void main(String[] args) {
		SBIBank sb=new SBIBank();
		sb.credit();
		sb.debit();
		sb.intrest();
		sb.loan();
		sb.funds();
		
		
		//dynamic polymorphism
		//by usingSBIBank object we can access Bank 
		//b.funds we cant accesss because it is SBIBank our own methods so u cant access
		Bank b=new SBIBank();
		b.loan();
		b.credit();
		b.debit();
		//b.funds();
	}

}
