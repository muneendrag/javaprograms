package munna;

import java.util.Scanner;

public class removewhitespace1 {
	public static void main(String[] args) {
		String str="hi hello world";
		String str1="";
		char[] strArray=str.toCharArray();
		for(int i=0;i<strArray.length;i++)
		{
			if((strArray[i]!=' '))
			{
				str1=str1+strArray[i];
			}
		}
		System.out.println(str1);
	}

}
