package munna;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		//int i=7;
		System.out.println("enter num:");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		if(i%2==0) {
			System.out.println("even:"+i);
		}else
		{
			System.out.println("odd:"+i);
		}
	}

}
