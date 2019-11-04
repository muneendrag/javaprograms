package javaPrograms;

public class SortingAnArray {

	public static void main(String[] args) {
		
		int arr[]= {1,100,6,88,27,55};
		System.out.println("original array:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
				System.out.println("sorted array:");
				for(int k=0;k<arr.length;k++) {
					System.out.print(arr[k]+" ");
				}
	}
}
