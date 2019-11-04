package oopsConcept;

class A1{
	void m1() {
		System.out.println("A1");
	}
}
interface I1{
	void m2();
}
interface I2{
	void m3();
}
public class HybridInheritance  extends A1 implements I1,I2{
	@Override
	public void m3() {
		System.out.println("m3 method from interfece I2");
	}

	@Override
	public void m2() {
		System.out.println("m2 method from interfece I1");
		
	}
	public static void main(String[] args) {
		HybridInheritance hi=new HybridInheritance();
		hi.m1();
		hi.m2();
		hi.m3();
	}


}
