package munna;

public class ReverseString {
	public static void main(String[] args) {
		//By using reverse method
		
		String str="Hi Hello";
	    StringBuilder sb=new StringBuilder(str);
		System.out.println(sb.reverse().toString());  
		
		//By using normal conditions
//		String reverse="";
//		for(int i=str.length()-1;i>=0;i--) {
//			reverse=reverse+str.charAt(i);
//		}
//		System.out.println(reverse);
//	}
	}
}
