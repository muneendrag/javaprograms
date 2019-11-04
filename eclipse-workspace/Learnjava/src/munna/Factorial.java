package munna;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		int f=1;
		System.out.println("enter a number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for (int i = 1; i <=n; i++) {
			f=f*i;
			
		}
		System.out.println("the factorial of:"+n+" is "+ f);
	}

}
