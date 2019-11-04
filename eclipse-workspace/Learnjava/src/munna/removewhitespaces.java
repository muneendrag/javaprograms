package munna;

public class removewhitespaces {
	public static void main(String[] args) {
	String str="hi hello world";
	String nospace=str.replaceAll("\\s","");
	System.out.println(nospace);
	}
}
