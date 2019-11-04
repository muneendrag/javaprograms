package munna;

public class MethodOverRiding extends MethodOverLoading {
	public  void display() {
		int a=20;
		System.out.println(a);
	}
	public static void main(String[] args) {
		MethodOverRiding m2=new MethodOverRiding();
		m2.display();
		
	}
	

}
