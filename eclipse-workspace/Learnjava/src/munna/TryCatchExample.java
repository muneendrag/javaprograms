package munna;

public class TryCatchExample {
	public static void main(String[] args) {
		try {
			int a[]=new int[5];
			a[5]=30/0;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("hi");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}
}
