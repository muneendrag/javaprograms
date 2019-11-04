package munna;

public class StringToArrayConversion {

	public static void main(String[] args) {
		
		String str="Hi hello how r u";
		String arr[]=str.split(" ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
