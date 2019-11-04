package munna;

public class RemoveVowels {
	public static void main(String[] args) {
		String str="Hi,Hello World";
		//String str2=str.replace('H', 'a');
		String str1=str.replaceAll("[aeiouAEIOU]", "");
		System.out.println(str1);
		
	}

}
