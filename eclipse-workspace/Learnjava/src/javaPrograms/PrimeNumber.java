package javaPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int num;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		num=sc.nextInt();
		
		for(int i=2;i<num;i++) {
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0)
			System.out.println(num+" :is prime");
		else
			System.out.println(num+" :is not prime");
	}

}
