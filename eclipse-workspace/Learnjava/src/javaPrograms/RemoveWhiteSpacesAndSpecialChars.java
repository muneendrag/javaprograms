package javaPrograms;

public class RemoveWhiteSpacesAndSpecialChars {

	public static void main(String[] args) {
		//to remove whitespaces
		
         String str="Hi ,  Hello  #   World@123  $ how are & you";
         String str1="";
         char[] chars=str.toCharArray();
         for(int i=0;i<chars.length;i++) {
        	 if(chars[i]!=' ' && chars[i]!='\t') {
        		 str1=str1+chars[i];
        	 }
         }
         System.out.println(str1);
		
		//By using regular expression [^a-zA-Z0-9] other than this remove all values
		String str2=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str2);
		
		//By using regular expression
		String str3=str.replaceAll("\\s", "");
		System.out.println(str3);
		
	}

}
