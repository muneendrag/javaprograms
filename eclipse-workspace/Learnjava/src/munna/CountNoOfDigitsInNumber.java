package munna;

public class CountNoOfDigitsInNumber {

	public static void main(String[] args) {
		int num=3457;
		int count=0;
		while(num>0) {
			num=num/10;
			count++;
		}
		System.out.println(count);
	}

}
