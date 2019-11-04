package munna;

public class MethodOverLoading {
	public  void display() {
		int a=10;
		System.out.println(a);
	}
	public  void display(String a) {
		System.out.println(a);
	}
	public static void display(String a,String b) {
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		MethodOverLoading m1=new MethodOverLoading();
		m1.display();
		m1.display("hello");
		display("hi","how");
	}

}
