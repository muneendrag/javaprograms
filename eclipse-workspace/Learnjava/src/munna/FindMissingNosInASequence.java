package munna;

public class FindMissingNosInASequence {

	public static void main(String[] args) {
		
		int arr[]= {3,5,8,10,15};
		int j=0;
		int count=15;
//		int max=arr[0];
//		for(int i=1;i<arr.length;i++) {
//			if(arr[i]>max)
//				max=arr[i];
//		}
		for(int i=1;i<=count;i++) {
			if(j<arr.length && i==arr[j]) {
				j++;
			}else
			{
				System.out.print(i+" ");
			}
		}
	}

}
//		int sum1=0;
//		for(int i=0;i<arr.length;i++) {
//			sum1=sum1+arr[i];
//		}
//		System.out.println(sum1);
//		
//		int sum2=0;
//		for(int i=0;i<5;i++) {
//			sum2=sum2+arr[i];
//		}
//		System.out.println(sum2);
//		System.out.println(sum2-sum1);
//		
//	}
//}
