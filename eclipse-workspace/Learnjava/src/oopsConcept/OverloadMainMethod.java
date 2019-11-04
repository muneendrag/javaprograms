package oopsConcept;

public class OverloadMainMethod {

	public static void main(String[] args) {
		System.out.println("main with string[] args");
	}
	public static void main(String[] args,int b,int c) {
		System.out.println("main with int");
	}
	public static void main(String[] args,int a) {
		System.out.println("main with");
	}
	public static void main(String args,String arg[]) {
		System.out.println("main with string[] args");
	}
	

}
