package oopsConcept;

public class ThisKeyword {
	int a;      //instance variables or class variables
	int b;
	public void add(int a,int b) {
		//method variables
		this.a=a;
	    this.b=b;
	}
	public void printValues() {
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		ThisKeyword th=new ThisKeyword();
		th.add(10, 20);
		th.printValues();
	}

}
