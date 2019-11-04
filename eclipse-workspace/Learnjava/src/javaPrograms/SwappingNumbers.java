package javaPrograms;

public class SwappingNumbers {

	public static void main(String[] args) {
		
		int x=10;
		int y=20;
		System.out.println("Before Swapping:" + x + " " +y);
		
		System.out.println("-------------");
		//1)By using 3rd variable
	/*	int temp;
		temp=x;
		x=y;
		y=temp;
		System.out.println("After Swapping:" + x + " " +y);
	*/	
		System.out.println("------------");
		//2)without thired variable
		
	/*	x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After Swapping:" + x + " " +y);
    */
		
		x=x*y;
		y=x/y;
		x=x/y;
		System.out.println("After Swapping:" + x + " " +y);

		
		
	}

}
