package munna;

public class SecondLargestElementInArray {
	public static void main(String[] args) {
		int arr[]= {12,10,100,199,19,98,80};
		int largest=arr[0];
		int secondlargest=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				secondlargest=largest;
				largest=arr[i];
			}
			else if(arr[i]>secondlargest)
				secondlargest=arr[i];
		}
		System.out.println("secondlargest is:"+secondlargest);
	}

}
