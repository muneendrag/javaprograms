package oopsConcept;

public class MethodsInJava {

	//void does not return any value
	public void test() {
		System.out.println("test method");
	}
	public String sum() {
		String s="JAVA";
		return s;
	}
	public int abc() {
		System.out.println("abc method");
		int a=10;
		int b=20;
		int c=a+b;
		return c;
	}
	public static void main(String[] args) {
		
		MethodsInJava m=new MethodsInJava();
		int x=m.abc();
		System.out.println(x);
		String s1=m.sum();
		System.out.println(s1);
		m.test();
		
		
		

	}

}
