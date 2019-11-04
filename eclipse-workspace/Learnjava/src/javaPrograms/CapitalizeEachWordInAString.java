package javaPrograms;

public class CapitalizeEachWordInAString {

	public static void main(String[] args) {
		String str="Hi hello world";
		String capitalizeWord="";
		String words[]=str.split("\\s");
		for(String w:words) {
			String first=w.substring(0, 1);
			String afterfirst=w.substring(1);
			//String capitalizeWord = capitalizeWord+first.toUpperCase()+afterfirst;
		}
	}

}
