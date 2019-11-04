package munna;

public class CountVowelConsonent {
	public static void main(String[] args) {
		int vowels=0,consonents=0,digits=0,whitespaces = 0;
		char ch;
		String str="Hi,Hello world Munna123";
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='U'||ch=='u')
				vowels++;
			else if(Character.isDigit(ch))
			     digits++;
			else if(Character.isWhitespace(ch))
				whitespaces++;
			else
				consonents++;
		}
		System.out.println(" vowels: " + vowels + " consonents: " + consonents + " digits: " + digits + " whitespaces: " + whitespaces);
	}
	

}

