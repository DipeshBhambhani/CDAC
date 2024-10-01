import java.util.Scanner;
class PrimeRecursive{
	public static boolean prime(int n, int i){
		if(n==0 || n==1){
			return false;
		}
		if(n==2){
			return true;
		}
		if(i<n){
			if(n%i!=0){
				return true;
			}
			else{
				return false;
			}
	}
	return prime(n,i++);
	}
	
	public static void main(String args[]){
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(prime(n,2));
	}
}