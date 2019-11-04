package munna;

abstract class Exabstraction{
	abstract void run();

}
class Honda extends Exabstraction{
	void run() {
		System.out.println("running");
	}
	public static void main(String[] args) {
		Honda ab=new Honda();
		ab.run();
	}
}
