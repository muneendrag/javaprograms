package javaPrograms;

public class SortingString {

	public static void main(String[] args) {
		
		String str="edcba";
		char[] chars=str.toCharArray();
				System.out.println("original String:");
				for(int i=0;i<chars.length;i++) {
					System.out.print(chars[i]+" ");
				}
				System.out.println();
				
				for(int i=0;i<chars.length;i++) {
					for(int j=i+1;j<chars.length;j++) {
						if(chars[i]>chars[j]) {
							char temp=chars[i];
							chars[i]=chars[j];
							chars[j]=temp;
						}
					}
				}
						System.out.println("sorted array:");
						for(int k=0;k<chars.length;k++) {
							System.out.print(chars[k]+" ");
						}
			
          }

}
