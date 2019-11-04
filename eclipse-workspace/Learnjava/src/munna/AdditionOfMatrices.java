package munna;

import java.util.Scanner;

public class AdditionOfMatrices {
	public static void main(String[] args) {
		int rows,cols,c,d;
		System.out.println("enter the no of rows and cols:");
		Scanner sc=new Scanner(System.in);
		rows=sc.nextInt();
		cols=sc.nextInt();
		int a[][]=new int[rows][cols];
		int b[][]=new int[rows][cols];
		int sum[][]=new int[rows][cols];
        System.out.println("enter 1st array:");
        for(c=0;c<rows;c++)
        	for(d=0;d<cols;d++)
        		a[c][d]=sc.nextInt();
        System.out.println("enter 2nd array:");
        for(c=0;c<rows;c++)
        	for(d=0;d<cols;d++)
        		b[c][d]=sc.nextInt();
        for(c=0;c<rows;c++)
        	for(d=0;d<cols;d++)
        		sum[c][d]=a[c][d]+b[c][d];
        System.out.println("sum of matrices are:");
        for(c=0;c<rows;c++)
        	for(d=0;d<cols;d++)
        		System.out.println(sum[c][d]+"\t");
        System.out.println();

		

	}

}
