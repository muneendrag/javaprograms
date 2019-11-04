package exceptionHandling;

public class SampleExceptons {
	
	public static void main(String[] args) {
		int a=50;
		//System.out.println(a/0); //arithmatic exception
		try {
			System.out.println(a/0);
		}catch (ArithmeticException e) {
			System.out.println("cant divide by zero");
		}
		String str=null;
		//System.out.println(str.length()); //null pointer exception
		
		String s1="hello";
		//int i=Integer.parseInt(s1);
	    //System.out.println(i); //numberformat exception
		
		int Arr[]=new int[5];
		Arr[10]=100; //ArrayIndexoutofbound exception
		
		
		
		
	}

}
