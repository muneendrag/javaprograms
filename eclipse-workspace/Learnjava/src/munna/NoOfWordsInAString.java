package munna;

public class NoOfWordsInAString {
	public static void main(String[] args) {
		String str="Hi hello world";
		int count = 1;
		for(int i=1;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
				count++;
		}
			System.out.println("no of words in a string:"+count);
	}

}
