package javaPrograms;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		int num,rem,cube=0,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		num=sc.nextInt();
		temp=num;
		while(num>0) {
			rem=num%10;
			num=num/10;
			cube=cube+rem*rem*rem;
		}
		if(cube==temp)
			System.out.println("armstrong");
		else
			System.out.println("not armstrong");
	}

}
