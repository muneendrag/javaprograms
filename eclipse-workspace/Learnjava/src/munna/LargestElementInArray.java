package munna;

public class LargestElementInArray {
	public static void main(String[] args) {
		int arr[]= {10,203,90,388,100};
		int largest=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
				largest=arr[i];
		}
		System.out.println("largest is:"+largest);
	}

}
