package munna;

public class StringLengthWithoutLengthMethod {

	public static void main(String[] args) {
		String str="HelloWorld";
		//using string method
		System.out.println(str.length());
		//without using length method
		int count=0;
		for(char ch:str.toCharArray()) {
			count++;
		}
		System.out.println(count);
	}

}
