package oopsConcept;

class A{
	int a;
	void display() {
		System.out.println(a);
	}
}
class B extends A{
	int b;
	void print() {
		System.out.println(b);
	}
}

public class Inheritance {

	public static void main(String[] args) {
		A obj=new A();
		obj.a=10;
		obj.display();
		
		B obj1=new B();
		obj1.a=30;
		obj1.b=20;
		obj1.display();
		obj1.print();

	}

}
