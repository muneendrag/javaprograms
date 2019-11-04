package oopsConcept;


class parent{
	int a;
	void display() {
		System.out.println(a);
	}
}
class child1 extends parent{
	int b;
	void show() {
		System.out.println(b);
	}
}
class child2 extends parent{
	int c;
	void print() {
		System.out.println(c);
	}
}
public class HieraricalInheritance {

	public static void main(String[] args) {
		child1 c1=new child1();
		c1.a=100;
		c1.b=200;
		c1.display();
		c1.show();
		
		child2 c2=new child2();
		c2.a=10;
		c2.c=20;
		c2.display();
		c2.print();
	}

}
