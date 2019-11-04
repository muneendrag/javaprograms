package javaPrograms;

public class ReverseString {
	
	//By using for loop
	//public static void main(String[] args) {
		//String str="World";
		//String rev="";
		//for(int i=str.length()-1;i>=0;i--) {
			//rev=rev+str.charAt(i);
		//}
		//System.out.println(rev);
	//}
	
	//By using reverse function StringBuffer Class
	public static void main(String[] args) {
		String str="World";
		StringBuffer sb=new StringBuffer(str);
		//StringBuffer s1=sb.reverse();
		//System.out.println(s1);
		System.out.println(sb.reverse());
	}

}
