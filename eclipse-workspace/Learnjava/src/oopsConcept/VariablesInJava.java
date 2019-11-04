package oopsConcept;

public class VariablesInJava {
	//global variables
	int age=30;
	static String s="test";
	
	public static void main(String[] args) {
		int i=100; //local variable for main() method
		System.out.println(i);
		System.out.println(s);
		VariablesInJava obj=new VariablesInJava();
		int b=obj.age;
		System.out.println(b);
	}
	public void sum() {
		//local variables
	    int i=10;//local variable for sum()method
		int j=20;
		int age=25;
	}

}
