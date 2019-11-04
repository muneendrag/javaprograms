package oopsConcept;
interface B{
	int a=10;
	void m1();
	
}

public class Interface implements B{
	public void m1() {
		System.out.println(a);
	}
	public static void main(String[] args) {
		Interface i=new Interface();
		i.m1();
	}
}
