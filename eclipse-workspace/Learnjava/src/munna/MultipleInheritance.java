package munna;
interface printable{
	void print();
}
interface drawable{
	void draw();
}

public class MultipleInheritance implements printable,drawable {
	public void print()
	{
		System.out.println("hello");
	}
	public void draw()
	{
		System.out.println("welcome");
	}
	public static void main(String[] args) {
		MultipleInheritance mi=new MultipleInheritance();
		mi.print();
		mi.draw();
	}

}
