package munna;

import java.util.Scanner;

public class StringReverse1 {
	public static void main(String[] args) {
		System.out.println("enetr the string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		StringBuilder sb=new StringBuilder(str);
		System.out.println("reverse string is:"+sb.reverse().toString());
	
	}
}
	
