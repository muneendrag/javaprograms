package javaPrograms;

public class PrintNumInDesc {

	public static void main(String[] args) {
		System.out.println("-------------using for--------");
		for(int i=10;i>=0;i--) {
			System.out.println(i);
		}
		
		System.out.println("--------------using while---------");
		
		int i=10;
		while(i>=0) {
			System.out.println(i);
			i--;
		}
	}

}
