package javaPrograms;

public class StringReverse {

	public static void main(String[] args) {
		String str="Hi Hello";
		
		//By using for loop
		
		String reverse="";
		for(int i=str.length()-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
		}
		System.out.println(reverse);
		
		//By using StrigBuilder
		
		StringBuilder sb=new StringBuilder(str);
		String rev=sb.reverse().toString();
		System.out.println(rev);
		
		//By using StrigBuffer
		
		StringBuffer sb1=new StringBuffer(str);
		System.out.println(sb1.reverse());
	}

}
