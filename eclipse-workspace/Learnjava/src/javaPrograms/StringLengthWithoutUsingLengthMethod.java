package javaPrograms;

public class StringLengthWithoutUsingLengthMethod {

	public static void main(String[] args) {
		
		String str="Hello";
		//with using length
		System.out.println(str.length());
		//without using length
		int count=0;
		for(char ch:str.toCharArray()) {
			count++;
		}
		System.out.println(count);
	}

}
