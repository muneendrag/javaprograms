package munna;

import java.util.Scanner;

public class LowerCaseToUpperCase {
	public static void main(String[] args) {
		int i,len;
		char ch;
		System.out.println("enter the string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		len=str.length();
		for(i=0;i<len;i++)
		{
			ch=str.charAt(i);
			if(Character.isUpperCase(ch))
			  System.out.print(Character.toLowerCase(ch));
			else
				  System.out.print(Character.toUpperCase(ch));

		}
	}

}
