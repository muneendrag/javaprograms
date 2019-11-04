package munna;

import java.util.Scanner;

public class Lower {
	public static void main(String[] args) {
		int i;
		char ch;
		String str="Hi,HeLLo";
		for(i=0;i<str.length();i++) {
			ch=str.charAt(i);
			if(Character.isUpperCase(ch))
				System.out.print(Character.toLowerCase(ch));
			else
				System.out.print(Character.toUpperCase(ch));
		}
	}

}
