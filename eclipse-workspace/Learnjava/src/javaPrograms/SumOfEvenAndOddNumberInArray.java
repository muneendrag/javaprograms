package javaPrograms;

public class SumOfEvenAndOddNumberInArray {

	public static void main(String[] args) {
		int sum=0;
		int arr[]= {1,4,9,6,12,7};
		for(int i =0;i<arr.length;i++) {
//			if(arr[i]%2==0) {
//				sum=sum+arr[i];
//				System.out.println(sum);
//			}
			 if(arr[i]%2!=0) {
				sum=sum+arr[i];
				System.out.println(sum);
			}
		}
	}

}
