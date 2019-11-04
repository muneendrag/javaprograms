package javaPrograms;

import java.util.Arrays;

public class AnagramProgram {

	public static void main(String[] args) {
		
		//anagram means two same strings with different order or 
		//sequence but having same size same characters
		
		String str1="Hello";
		String str2="LLEHO";
		//convert strings to lower or upper
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		if(str1.length()!=str2.length()) {
			System.out.println("not anagrams");
		}
		else
		{
			char[] ch1=str1.toCharArray();
			char[] ch2=str2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			if(Arrays.equals(ch1, ch2)==true) 
				System.out.println("anagrams");
			else
				System.out.println("not anagrams");
		}
		
		
	}

}
