package javaPrograms;

public class SwappingStrings {

	public static void main(String[] args) {
		
		String x="hello";
		String y="world";
		System.out.println("Before Swapping:" + x +" "+ y);
		x=x+y;
		y=x.substring(0, x.length()-y.length());
		x=x.substring(y.length());
		System.out.println("After Swapping:" + x +" "+ y);
		
	}

}
