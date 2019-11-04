package munna;

public class ExMethods {
	public void instanceMethod() {
		System.out.println("instance method");
	}
	public static  void staticMethod() {
		System.out.println("static method");
	}
	public static void main(String[] args) {
		ExMethods e1=new ExMethods();
		e1.instanceMethod();
		staticMethod();
	}

}
