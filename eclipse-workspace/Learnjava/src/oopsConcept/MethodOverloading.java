package oopsConcept;

public class MethodOverloading {

	public static void main(String[] args) {
          MethodOverloading obj=new MethodOverloading();
          obj.sum();
          obj.sum(10);
          obj.sum(10,20.05  );
	}
	public void sum() {
		System.out.println("sum--no param");
	}
	public void sum(int a) {
		System.out.println("sum--1 param");
		System.out.println(a);
		
	}
	public void sum(int a,double b) {
		System.out.println("sum--2 param");
		System.out.println(a+b);
	}
	

}
