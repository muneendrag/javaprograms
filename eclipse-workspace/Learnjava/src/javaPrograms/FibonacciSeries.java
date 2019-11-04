package javaPrograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int n1=0,n2=1,sum;
		System.out.println("enter number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(n1);
		System.out.println(n2);
		for(int i=0;i<n;i++) {
			sum=n1+n2;
			//if(sum<=n) {
			n1=n2;
			n2=sum;
			System.out.println(sum);
		//}
	  }
	}

}
