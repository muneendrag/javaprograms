package javaPrograms;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		
		int arr[]= {1,27,88,100,6,88,6,27,55,1};
		System.out.println("original array:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.println("duplicates:");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[i]+" ");
			  }
		   }
		}
	}
}
			
			
