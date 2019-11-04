package oopsConcept;

public class EncapsulationConcept {
	//how to implement encapsulation:
	//create instance variables as private so that no one can access directly from outside the class.
	//privte data variables	
	private int ssn;
	private String ename;
	private int eage;
	public static void main(String[] args) {
		EncapsulationConcept e=new EncapsulationConcept();
		e.setEname("munna");
		e.setEage(24);
		e.setSsn(12345);
		System.out.println("employee name:"+e.getEname());
		System.out.println("employee age:"+e.getEage());
		System.out.println("employee ssnno"+e.getSsn());
	}
	
	
	//getter and setter methods:to set and get the values of the variables
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEage() {
		return eage;
	}
	public void setEage(int eage) {
		this.eage = eage;
	}

}
