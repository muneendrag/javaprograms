package munna;

import java.util.Scanner;

public class LargestnoIn3 {
	public static void main(String[] args) {
		int a,b,c;
		System.out.println("enter the numbers:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>=b && a>=c) 
			System.out.println("largest no:"+a);
		else if(b>=a && b>=c)
			System.out.println("largest no:"+b);
		else
			System.out.println("largest no:"+c);
	}

}
