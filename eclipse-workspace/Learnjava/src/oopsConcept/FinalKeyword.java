package oopsConcept;

class Bike{
	 void run() { //if i declare method as a final i cant create or override the child class method
		System.out.println("running");
	}
}
class honda extends Bike{
	void run() {
		System.out.println("statrted");
	}
}


public class FinalKeyword {
	
	//final keyword-if we declare any variable or method or class as a final which is fixed...we cant change...
	/*int a=10;
	final int b=20;
	
	public static void main(String[] args) {
		FinalKeyword fi=new FinalKeyword();
		fi.a=100;
		//fi.b=200;  it is final so we cant change
		System.out.println(fi.a);
	}*/
	
	public static void main(String[] args) {
		honda h=new honda();
		h.run();
	}
}
