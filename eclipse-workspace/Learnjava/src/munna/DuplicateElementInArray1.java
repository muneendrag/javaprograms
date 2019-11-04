package munna;

public class DuplicateElementInArray1 {
	public static void main(String[] args) {
		int[] myarray= {1,3,5,1,5,7,9,0};
		for(int i=0;i<myarray.length;i++) 
		{
			for(int j=i+1;j<myarray.length;j++) 
			{
				if(myarray[i]==myarray[j])
				{
					System.out.println("duplicate:"+myarray[j]);
				}
				
			}
		}
	}

}
