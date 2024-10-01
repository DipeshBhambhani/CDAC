import java.util.Scanner;

class FibonacciRecursive{
	public static int fibonacci(int n){
		//System.out.println(n1,n2);
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		return fibonacci(n-1) + fibonacci(n-2);
	}
	public static void main(String args[]){
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
		System.out.println(fibonacci(i));
		}
	}
}