package oopsConcept;
interface car
{
	int a=10;  //by defualt variables in interface are static and final
	void m1(); // abstarct method,it doesn't contain any body,no need to write abstract keyword in interface,
             	//by defualt methods are public	
}
public class InterfaceTestDemo implements car {

	public void m1() {
		System.out.println(a);
	}
	public static void main(String[] args) {
		InterfaceTestDemo it=new InterfaceTestDemo();
		it.m1();
	}


}
