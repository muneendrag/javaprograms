package javaPrograms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num,rem,sum,temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		num=sc.nextInt();
		sum=num;
		while(num>0) {
		    rem=num%10;
		    num=num/10;
		    temp=temp*10+rem;
			
			
		}
		if(temp==sum) {
			System.out.println("armstrong");
		}
		else {
			System.out.println("not armstrong");
		}
	}

}
