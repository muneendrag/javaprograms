package munna;

public class OddEvenPositioInArray {
	public static void main(String[] args) {
		int a[]= {10,20,21,26,98,72,77};
		System.out.println("the odd elements are:");
		for(int i=0;i<a.length;i=i+2)
		{
			System.out.println(a[i]);
		}
		System.out.println("the even elements are:");
		for(int i=1;i<a.length;i=i+2)
		{
			System.out.println(a[i]);
		}
	}

}
