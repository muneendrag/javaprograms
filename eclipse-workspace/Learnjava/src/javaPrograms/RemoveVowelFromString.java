package javaPrograms;

public class RemoveVowelFromString {

	public static void main(String[] args) {
		
		String str="HelloWorld";
		String str1=str.replaceAll("[aeiouAEIOU]", "");
		System.out.println(str1);
	}

}
