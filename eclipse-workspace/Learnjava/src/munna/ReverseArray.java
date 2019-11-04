package munna;

public class ReverseArray {
	public static void main(String[] args) {
		int a[]= {9,8,7,6,5};
		System.out.println("original array:");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+"");
		
		System.out.println("reversed array:");
		for(int i=a.length-1;i>=0;i--)
			System.out.print(a[i]);
	}

}
