package munna;

public class MinMaxInArray {
	public static void main(String[] args) {
		int a[]= {1,0,7,8,9,2};
		int min=a[0];
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
			else if(a[i]<min)
				min=a[i];
		}
		System.out.println(min);
		System.out.println(max);
	}

}
