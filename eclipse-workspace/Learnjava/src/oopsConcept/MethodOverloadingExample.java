package oopsConcept;

public class MethodOverloadingExample {
	

	public int sum(int x,int y) {
		return x+y;
	}

	public int sum(int x,int y,int z) {
		return x+y+z;
	}

	public double sum(double x,double y) {
		return x+y;
	}

	public double sum(double x,double y,double z) {
		return x+y+z;
	}
	public static void main(String[] args) {
		MethodOverloadingExample me=new MethodOverloadingExample();
		System.out.println(me.sum(10.5, 10.55));
		System.out.println(me.sum(10, 20));
		
	}

}
