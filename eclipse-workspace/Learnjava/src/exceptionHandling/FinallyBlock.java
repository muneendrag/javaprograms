package exceptionHandling;

public class FinallyBlock {
	public static void main(String[] args) {
		System.out.println("start");
		int a=100;
		try {
			//System.out.println(a/2);
			System.out.println(a/0);
		}catch (NullPointerException e) {
			System.out.println("entered into catch block");
		}
		finally {
			System.out.println("finally block");
		}
		
	}

}
