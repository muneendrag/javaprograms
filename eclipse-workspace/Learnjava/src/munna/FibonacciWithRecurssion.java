package munna;

public class FibonacciWithRecurssion {
	public void fibo(int n1,int n2) {
		int sum=0;
		if(n1==0) {
			System.out.println(n1+"\n"+n2);
		}
		if(sum<=100) {
			System.out.println(sum);
			n1=n2;
			n2=sum;
			fibo(n1,n2);
		}
	}
	public static void main(String[] args) {
		FibonacciWithRecurssion fb=new FibonacciWithRecurssion();
		fb.fibo(0, 1);
	}

}
