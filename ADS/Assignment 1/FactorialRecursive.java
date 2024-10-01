import java.util.Scanner;
class FactorialRecursive{
	public static int factorial(int n){
		if(n==1){
			return 1;
		}
		else{
			return n*factorial(n-1);
		}
	}
	
	public static void main(String args[]){
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(factorial(n));
	}
}
	