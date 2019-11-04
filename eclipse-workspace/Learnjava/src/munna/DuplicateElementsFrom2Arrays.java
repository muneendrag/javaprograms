package munna;

public class DuplicateElementsFrom2Arrays {

	public static void main(String[] args) {
		
		int arr1[]= {1,3,2,9,6};
		int arr2[]= {10,9,8,2,6,5,7};
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println("duplicates:"+arr1[i]);
				}
			}
		}
	}

}
