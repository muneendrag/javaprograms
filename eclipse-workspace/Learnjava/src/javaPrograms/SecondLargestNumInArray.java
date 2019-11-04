package javaPrograms;

public class SecondLargestNumInArray {

	public static void main(String[] args) {
		
		int arr[]= {10,20,8,90,55};
		int largest=arr[0];
		int seclargest=arr[0];
		for(int i=0;i<arr.length;i++) {
			
				if(arr[i]>largest) {
					seclargest=largest;
					largest=arr[i];
				}
				else if(arr[i]>seclargest) {
					seclargest=arr[i];
				}
			}
		System.out.println("secondLargest num:" + " " +seclargest);
	}

}
