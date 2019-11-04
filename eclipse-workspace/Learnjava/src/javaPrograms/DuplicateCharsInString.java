package javaPrograms;

public class DuplicateCharsInString {

	public static void main(String[] args) {
		
		String str="HelloWorld";
		int count=0;
		char[] chars=str.toCharArray();
		System.out.println("original string:"+" "+str);
		
		for(int i=0;i<chars.length;i++) {
			for(int j=i+1;j<chars.length;j++) {
				if(chars[i]==chars[j]) {
					System.out.print(chars[i]+" ");
				}
			}
		}
	}

}
