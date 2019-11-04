package munna;

public class VariousTypesOfMethods {
	public static void sum() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	public static void diff(int a,int b) {
		int c=a-b;
		System.out.println(c);
	}
	public static void mul() {
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println(c);;
	}
	public static int div(int a,int b) {
		int  c=a/b;
		return c;
	}
	public static void main(String[] args) {
		sum();
		diff(10,20);
		mul();
		int c=div(10,5);
		System.out.println(c);
	}

}
