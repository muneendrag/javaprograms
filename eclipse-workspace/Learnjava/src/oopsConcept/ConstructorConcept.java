package oopsConcept;

public class ConstructorConcept {
	// class variable or global variable
	String name;
	int age;

	public ConstructorConcept() { // 0 param constructor
		System.out.println("default constructor");

	}

	public ConstructorConcept(int i) { // 1 param
		System.out.println("1 param constructor");
		System.out.println(i);
	}

	public ConstructorConcept(int i, int j) { // 2 param
		System.out.println("2 param constructor");
		System.out.println(i + " " + j);
	}

	public ConstructorConcept(String name, int age) {
		this.name = name; // this.classvar=localvar
		this.age = age;
	}

	public static void main(String[] args) {
		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(1, 2);
		ConstructorConcept obj3 = new ConstructorConcept("munna", 24);
		System.out.println(obj3.name);
		System.out.println(obj3.age);

	}

}
